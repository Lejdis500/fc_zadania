package Lesson7Task1;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static boolean isOdd(int n) {
        return n % 2 == 0;
    }

    public static int sum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String num = str.substring(i, i + 1);
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}