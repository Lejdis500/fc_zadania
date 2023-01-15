package Lesson6Task3;

import java.io.File;

public class Character {
    public static void main (String[] args){
        File file = new File("C:\\data.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    }
}
