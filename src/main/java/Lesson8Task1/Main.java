package Lesson8Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>(List.of("Anna, Katarzyna, Tymon"));
        List<String> names3 = new LinkedList<>();
        List<String> names4 = new Vector<>();
        List<String> names5 = new Stack<>();
        List<String> names6 = List.of("Anna, Katarzyna, Tymon");
        names2.add("Anna");
        names2.add("Katarzyna");
        names2.add("Tymon");
        names2.add("Tadeusz");
        names2.add("Anna");
        names2.add("Karolina");
        names2.add("Dorota");
        names2.add("Piotr");
        System.out.println(names2);

        ArrayList arrayList = new ArrayList();
        System.out.println("ArrayList elements : " + arrayList);

        // static void reverse(List list) method reverses the order of elements of the specified list.
        Collections.reverse(arrayList);

        System.out.println("ArrayList elements after reversing order : " + arrayList);


        Set<String> uniquenames = new HashSet<>();
        uniquenames.add("Anna");
        uniquenames.add("Katarzyna");
        uniquenames.add("Tymon");
        uniquenames.add("Tadeusz");
        uniquenames.add("Karolina");
        uniquenames.add("Dorota");
        uniquenames.add("Piotr");



    }
}