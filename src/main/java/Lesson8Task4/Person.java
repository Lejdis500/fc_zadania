package Lesson8Task4;

import com.sun.java.util.jar.pack.ClassReader;

public class Person {
    public class Person implements Comparable<Person> {
        private String name;
        private String surname;
        private long birthYear;
        private double weight;
        private double height;

        public Person(String name, String surname, long dateOfBirth, long birthYear, double weight, double height) {
            this.name = name;
            this.surname = surname;
            this.birthYear = birthYear;
            this.weight = weight;
            this.height = height;
        }

        @Override
        public int compareTo(Person o) {
            return birthYear.compareTo(o.getBirthYear());
        }


    }
}
