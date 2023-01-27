package Lesson8Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DateOfPerson.Person> persons = new ArrayList<>();
        persons.add(new DateOfPerson("Jan", "Kowalski", 2000L, 1.87d, 65.6d));
        persons.add(new DateOfPerson("Anna", "Nowak", 1996L, 1.67d, 50.2d));
        persons.add(new DateOfPerson("Bartosz", "Szymanski", 2002L, 2.07d, 102.0d));

        printPersons(persons);

        System.out.println("================================= Domyślnie");

        Collections.sort(persons);

        printPersons(persons);

        System.out.println("================================= Wzrost");

        persons.sort(Comparator.comparing(DateOfPerson::getHeight));

        printPersons(persons);

        System.out.println("================================= Waga");

        persons.sort(Comparator.comparing(DateOfPerson::getWeight).reversed());

        printPersons(persons);

    }


    public static void printPersons(List<DateOfPerson> persons) {
        for (DateOfPersonperson:
            System.out.println("person");
        }

    }

}
