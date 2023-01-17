package Lesson6Task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextConverter {
    static void convertText(String path) {
        try {
            String text = Files.readString(Path.of(path));
            System.out.println(text);
            String upperCase = text.toUpperCase();
            System.out.println(upperCase);
            Files.writeString(Path.of(path), upperCase);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}