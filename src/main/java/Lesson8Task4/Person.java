package Lesson8Task4;

public class Person {
    public class Person implements Comparable<Person> {
        private String name;
        private String surname;
        private long dateOfBirth;
        private double weight;
        private double height;

        public Person(String name, String surname, long dateOfBirth,double weight, double height) {
            this.name = name;
            this.surname = surname;
            this.dateOfBirth = dateOfBirth;
            this.weight = weight;
            this.height = height;
        }
        public

        @Override
        public int compareTo(Person o) {
            return 0;
        }
    }
}
