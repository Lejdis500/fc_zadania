package Lesson6Task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Character {
        public static void main(String[] args) {
            File file = new File("C:\\data.txt");
            try {
                String contect = Files.readString(Path.of("C:\\data.txt"));
                System.out.println(contect);
                System.out.println(contect.length());
            } catch (IOException e) {
            }
               e.printStackTrace ();
            }
        }
