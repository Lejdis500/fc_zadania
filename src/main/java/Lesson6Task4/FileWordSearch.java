package Lesson6Task4;

public class FileWordSearch {
    public static void main(String[] args) throws IOException {
        public static void main (String[]args){
            File file = new File("C:\\data.txt");
            try {
                String text = Files.readString(Path.of("C:\\data.txt"));
                System.out.println(text);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            writeToFile("C:\\data.txt");
        }

    }
}
