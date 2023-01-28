package Lesson10Task2;

public class Validate {
    public static void validate(String pesel) {
        if (pesel.length() != 11) {
            throw new IllegalArgumentException("Pesel powinien miec 11 znaków");

        }
        System.out.println("Hello world!");
    }
}