package Lesson6Task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ContentsInReverse {
    public static void ReserveLineContents(String path) {
        try {
            List<String> allLines = Files.readAllLines(Path.of(path));
            printReverse(allLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printReverse(List<String> allLines) {
        for (int i = allLines.size() - 1; i < 0; i--) {
            System.out.println(allLines.get(i));
        }
    }
}