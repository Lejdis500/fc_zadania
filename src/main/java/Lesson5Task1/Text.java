package Lesson5Task1;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ona programuje");
        String text = scanner.nextLine();

        if (text.length() == 0) {
            System.out.println("Pusty tekst");
        } else {
            int lenght = text.length();
            System.out.println("Długość tekstu: " + lenght);

            boolean isPalindrome = true;
            for (int i = 0; i < lenght / 2; i++) {
                if (text.charAt(i) != text.charAt(lenght - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Teskt jest palindromem");
            } else {
                System.out.println("Teskt nie jest palindromem");
            }
        }
    }
}
