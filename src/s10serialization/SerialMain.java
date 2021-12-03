package s10serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SerialMain {
    public static void main(String[] args) throws Exception {
        File file = Paths.get("files/person.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        Person person = new Person("Alex", "0991234567", LocalDate.of(2000, 2, 12));
        person.setDog(new Dog("Rex"));
        List<Person> list = new ArrayList<>();
        list.add(person);
        list.add(new Person("Jack", "0991244566", LocalDate.now()));


        // сохраняем в файл
        objectOutputStream.writeObject(list);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }
}
