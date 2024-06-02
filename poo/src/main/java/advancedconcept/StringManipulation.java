package advancedconcept;

public class StringManipulation {
    public static void main(String[] args) {
        String greeting = "Hello "; // revient à new String("Hello")
        String name = "Alice";
        System.out.println(greeting + name);
        System.out.println(greeting.toUpperCase());
        String name2 = "alice";
        System.out.println(name.equalsIgnoreCase(name2));
        char initial = greeting.charAt(0); // renvoie H
        String subString = greeting.substring(0, 3); // sous-chaine, renvoie Hell

        String greetingAlice = greeting + " " + name;
        System.out.println(greetingAlice.contains(name)); // renvoie true. Un élément est présent dans la chaîne de caractère
        System.out.println(greetingAlice.startsWith(greeting)); // renvoie true

        String birthdate = "20/05/2002";
        String[] items = birthdate.split("/"); // Split la date par les / dans un tableau

        boolean match = "12345".matches("\\d+"); // au moins un digit ou plus. Renvoie true

        StringBuilder builder = new StringBuilder();
        builder.append(greeting).append(" ").append(name);
        System.out.println(builder); // Renvoie Hello Alice

    }
}
