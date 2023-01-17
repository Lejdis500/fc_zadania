package Lesson6Task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharactersCounter {
    static void countCharacters(String path) {
        try {
            String content = Files.readString(Path.of(path));
            System.out.println(content);
            System.out.println(content.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
