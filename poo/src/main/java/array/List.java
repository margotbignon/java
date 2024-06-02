package array;

import java.util.*;


public class List {
    public static void main(String[] args) {
        /*java.util.List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Mango");

        fruits.get(1);*/
        //Set
        /*Set<String> cars = new HashSet<>();
        cars.add("Audi");
        cars.add("BMW");*/
        Map<String, Integer> courses = new HashMap<>();
        courses.put("Physics", 6);
        courses.put("English", 3);
        courses.put("Maths", 4);

        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
