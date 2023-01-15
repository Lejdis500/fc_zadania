package Lesson6Task4;

public class FileWordSearch {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\hp\\Desktop\\TextReader.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        int CharacterCount = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals("")) {
                paraCount += 1;
            } else {
                characterCount += line.length();

            }
        }
    }
}