package s10serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Paths;
import java.util.List;

public class DeserialMain {
    public static void main(String[] args) throws Exception {
        File file = Paths.get("files/person.data").toFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Person> persons = (List<Person>) objectInputStream.readObject();

        System.out.println(persons);
    }
}
