package Lesson6Task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextConverter {
    static void convertText(String inputPath, String outputPath) {
        try {
            String text = Files.readString(Path.of(inputPath));
            String upperCase = text.toUpperCase();
            Files.writeString(Path.of(outputPath), upperCase);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}