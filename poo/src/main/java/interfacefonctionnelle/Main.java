package interfacefonctionnelle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int x = 10, y = 3;
        /*Operation addition = new Operation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        //Possible que sur les interfaces fonctionnelles :
        Operation addition = (a, b) -> a + b;
        Operation multiplication = (a, b) -> a * b;

        System.out.println(addition.operate(x, y));

        Predicate<String> atChecker = str -> str.contains("@");
        System.out.println(atChecker.test("email"));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(System.out::println);

        Factory<ArrayList<String>> arrayListFactory = ArrayList::new;
        ArrayList<String> arrayList = arrayListFactory.create();

        //Api Stream
        //Filter
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
        //Map
        names.stream().map(n -> n.toUpperCase()).forEach(System.out::println);

        //Reduce
        String concatened = names.stream().reduce("Names", (accumulator, currentValue) -> accumulator + "," + currentValue);
        System.out.println(concatened);*/


    }
}
