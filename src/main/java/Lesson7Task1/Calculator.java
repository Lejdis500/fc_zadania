package Lesson7Task1;

public class Calculator {
    public static String isDivisibleBy2(int value) {
        if (value % 2 == 0) {
            return "true";
        } else if (value % 2 == 1) {
            return "false";
        } else
            return "error";
    }

    public static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }
}