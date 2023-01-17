package Lesson6Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {
    static void printFileContent() {
        try {
            String text = Files.readString(Path.of("src/main/resources/data.txt"));
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}