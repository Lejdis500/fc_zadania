package Lesson8Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", "Kowalski", 2000L, 1.87d, 65.6d));
        persons.add(new Person("Anna", "Nowak", 1996L, 1.67d, 50.2d));
        persons.add(new Person("Bartosz", "Szymanski", 2002L, 2.07d, 102.0d));

        printPersons(persons);

        System.out.println("================================= Domyślnie");

        Collections.sort(persons);

        printPersons(persons);

        System.out.println("================================= Wzrost");

        persons.sort(Comparator.comparing(Person::getHeight));

        printPersons(persons);

        System.out.println("================================= Waga");

        persons.sort(Comparator.comparing(Person::getWeight).reversed());

        printPersons(persons);

    }
    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }

    }
}