package Lesson6Task0;

import java.io.File;

public class Data {
    public static void main(String[] args) {
        File file = new File("C:\\data.txt");
        String fileName = file.getName();
        boolean isReadable = file.canRead();
        boolean exist = file.exists();

    }}

