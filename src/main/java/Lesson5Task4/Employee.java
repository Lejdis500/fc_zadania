package Lesson5Task4;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;
    private final String WHITE_SPACE = "";

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal sumOfSalary) {
        this(name, surname, age);
        this.baseSalary = sumOfSalary;
    }

    public Employee(String name, int age, BigDecimal valueOfBigDecimal, BigDecimal sumOfBonus, String surname) {
        this(name, surname, age);
        this.bonus = sumOfBonus;
    }

    public String getemployee_Info() {
        return "Employee name :" + name + "" + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details :" + name + "" + surname + "is" + age;
    }

    public BigDecimal getSalaryAndBonus() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getSalary() {
        return baseSalary;

    }
}

