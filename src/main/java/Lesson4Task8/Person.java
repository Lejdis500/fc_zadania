package Lesson4Task8;

import java.util.Objects;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String ssn;
    public Person (String firstName, String lastName, int age, String ssn) {
        this. firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    @Override
    public int hashCode()
    { return Objects.hash(firstName, lastName, age, ssn); }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return Objects.equals(firstName, p.firstName) &&
        return Objects.equals(lastName, p.lastName) &&
                age == p.age &&
                Objects.equals(ssn, p.ssn);
    }}
