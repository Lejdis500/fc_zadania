package Lesson8Task4;


public class Person implements Comparable<Person> {
    private String firstname;
    private String surname;
    private Long birthYear;
    private Double height;
    private Double weight;

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

    public String getSurname() {
        return surname;
    }

    public Long getBirthYear() {
        return birthYear;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
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
        return o.getBirthYear().compareTo(birthYear);
    }
}