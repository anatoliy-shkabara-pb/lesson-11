package s11json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // pretty printing (json с отступами)
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // для работы с полями типа LocalDate
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

        Map<String, String> data = new HashMap<>();
        data.put("key1", "val1");
        data.put("key2", "val2");

        String json = mapper.writeValueAsString(data);
        System.out.println(json);
        
        List<Person> persons = Arrays.asList(
                new Person("Jack", "1233456", LocalDate.of(2000, 5, 2)),
                new Person("Vasiliy", "3234345", LocalDate.of(1990, 4, 12)),
                new Person("Anna", "5454545", LocalDate.of(1996, 1, 20))
        );

        String personsJson = mapper.writeValueAsString(persons);
        System.out.println(personsJson);

        List persons2 = mapper.readValue(personsJson, List.class);
        System.out.println(persons2.get(0).getClass().getName());
        System.out.println(persons2);

        List<Person> persons3 = mapper.readValue(personsJson, new TypeReference<List<Person>>() {});
        System.out.println(persons3.get(0).getClass().getName());
        System.out.println(persons3);
    }
}
