package Lesson6Task3;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Character {
    public static void main(String[] args) {
        try {
            String contect = Files.readString(Paths.get("C:\\data.txt"));
            System.out.println(contect);
            System.out.println(contect.length());
        } catch (I0Exception e) {
            e.printStackTrace();
        }
    }
}