package newfeatures;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        /*LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());*/

        // Comparaison entre 2 dates
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime inOneHour = now.plusHours(1);

        Duration duration = Duration.between(now, inOneHour);
        System.out.println(duration.getSeconds());

        // Text blocs

        String query = """
                SELECT * FROM users
                WHERE id = ?
                """;

        // Records : n'a que des attributs final, peut pas faire des set, que des get
        Person toby = new Person("Toby", 12);
        System.out.println(toby);

        // Pattern matching
        var object = "Hello World.";
        if (object instanceof String str) {
            System.out.println(str);
        }


    }

    /*sealed class Shape permits Shape.Circle, Rectangle {
        class Circle extends Shape {
            final class Rectangle extends Shape {}
            class Triangle extends Shape {

            }
        }
    }*/
}
