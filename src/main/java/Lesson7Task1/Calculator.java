package Lesson7Task1;

public class Calculator {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int sumOfDigitsOfGivenNumber(int value) {
        int sum = 0;
        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }
}