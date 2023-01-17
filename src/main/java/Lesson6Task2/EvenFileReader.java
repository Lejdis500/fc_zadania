package Lesson6Task2;

import java.io.BufferedReader;
import java.io.IOException;

public class EvenFileReader {
    static void printEvenLinesFromFile(String pathToFile) throws IOException {
        String line;
        int i = 1;
        BufferedReader br = new BufferedReader(new java.io.FileReader(pathToFile));
        while ((line = br.readLine()) != null) {
            if (i++ % 2 == 0) {
                System.out.println(line);
            }
        }
    }
}
