package Lesson8Task4;

import com.sun.java.util.jar.pack.ClassReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    private final String firstname;

    public Person(String firstname, String surname, Long birthYear, Double height, Double weight) {
        this.firstname = firstname;
        this.surname = surname;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        String surname = null;
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Long birthYear) {
        this.birthYear = birthYear;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return birthYear.compareTo(o.getBirthYear());
    }

}

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


