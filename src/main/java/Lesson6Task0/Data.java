package Lesson6Task0;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Data {
    public static void main(String[] args) {
        try {
            Files.writeString(Paths.get("src/main/resources/data.txt"), "Kurs\n" +
                    "Java\n" +
                    "Lekcja 6\n" +
                    "Pliki\n" +
                    "Wyjątki\n" +
                    "Pliki\n" +
                    "Koniec pliku");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

