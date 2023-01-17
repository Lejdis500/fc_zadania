package Lesson6Task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWordSearch {
    static void searchWordInFile(String path, String word) {
        try {
            String text = Files.readString(Path.of(path));
            System.out.println(text);
            if (text.contains(word)) {
                System.out.println("Plik zawiera szukane słowo");
            } else {
                System.out.println("Plik nie zawiera szukanego słowa");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}