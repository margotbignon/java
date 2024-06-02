package advancedconcept;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class filemanipulation {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("example.txt");
        List<String> lines = List.of("First line.", "Second Line.", "Third line");
        Files.write(path, lines, StandardCharsets.UTF_8);

        //Serialiser un objet dans un fichier

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
        Person john = new Person("John", 34, "john@test.com");
        out.writeObject(john);

        //Déserialiser un fichier en objet
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
        try {
            Person person = (Person) in.readObject();
            System.out.println(person.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
