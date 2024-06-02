package generique;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.set(10);
        stringBox.set("hello");

        Pair<String, Double> articlePrice = new Pair<>("Pull", 75.0);
        Pair<String, Integer> studentGrade = new Pair<>("Henry", 16);

        articlePrice.getKey();
        studentGrade.getValue();

        isEqual(articlePrice, studentGrade);*/

        Box<Integer> intergerBox = new Box<>();
        List<Integer> integers = List.of(1,2,3,4);
        printList(integers);

        List <? super Integer> intergerList;
    }

    static <T> boolean isEqual(T element1, T element2) {
        return element1.equals(element2);
    }

    public static void printList(List<? extends Number>  list) {
        for (Number n: list) {
            System.out.println(n);
        }
    }
}
