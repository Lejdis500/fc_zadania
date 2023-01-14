package Lesson6Task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    private String pathToFile;

    public static void main(String[] args) {
        File file = new File("C:\\data.txt");

        try {
            String text = Files.readString(Path.of("C:\\data.txt"));
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void writeToFile(String pathToFile, String text) {
        this.pathToFile = pathToFile;
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathToFile))) {
            writer.write(text);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}