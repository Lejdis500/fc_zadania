package Lesson6Task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            EvenFileReader.printEvenLinesFromFile("src/main/resources/data.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}