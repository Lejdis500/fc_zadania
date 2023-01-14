package Lesson6Task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Text {
    public static void main(String[] args) {
        File file = new File("C:\\data.txt");
    }

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
        BufferedWriter br = new BufferedWriter(new FileWriter("data.txt"));
        String line;
        int i = 1;
        while ((line = br.readLine()) != null) {
            if (i++ % 2 == 0) {
                System.out.println(line);
            }
        }
    }
}