package Lesson6Task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ContentsInReverse {
    public static void printReversedFileContent (String path) {
        try {
            List<String> allLines = Files.readAllLines(Path.of(path));
            printReversed(allLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printReversed(List<String> allLines) {
        for (int i = allLines.size() - 1; i >= 0; i--) {
            System.out.println(allLines.get(i));
        }
    }
}