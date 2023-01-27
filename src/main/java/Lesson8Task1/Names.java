package Lesson8Task1;

import java.util.ArrayList;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");
        List<String> uniqueNames = new ArrayList<>();
        for (String name : names) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }
        System.out.println("List without duplicates" + uniqueNames);

        List<String> reverseNames = new ArrayList<>();
        for (int i = uniqueNames.size() - 1; i >= 0; i--) {
            reverseNames.add(uniqueNames.get(i));
        }
        System.out.println("Elements in reverse order:" + reverseNames);
        String changeFrom = "Anna";
        String changeTo = "Joanna";
        for (int i = 0; i < reverseNames.size(); i++) {
            if (reverseNames.get(i).equals(changeFrom)) {
                reverseNames.set(i, changeTo);
            }
        }
        System.out.println("Elements after change: " + changeFrom + "->" + changeTo + "");
    }
}