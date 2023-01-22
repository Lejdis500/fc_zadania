package Lesson7Task2;

public class StringUtils {
    public static String toUpperCase(String input) {
        if (input == null) {
            throw new IllegalArgumentException("The place cannot be empty");
        }
        return input.toUpperCase();
    }
}