package Lesson6Task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Text {
    public class Main {
        public static void main(String[] args) {
            File file = new File("C:\\data.txt");
            String fileName = file.getName();
            boolean isReadable = file.canRead();
            boolean exists = file.exists();
            try {
                String text = Files.readString(Path.of("C:\\data.txt"));
                System.out.println(text);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }}