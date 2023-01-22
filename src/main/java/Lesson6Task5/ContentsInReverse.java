package Lesson6Task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ContentsInReverse {
    static void ReserveLineContents(String path) {
        try {
            String content = Files.readString(Path.of(path));
            System.out.println(content);
            ReserveLineContents ReserveLineContents = new ReserveLineContents(file, "data.txt");
            String line;

            while ((line = reverseLineReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}