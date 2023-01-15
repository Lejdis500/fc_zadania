package Lesson6Task6;

public class UpperCase {
    public static void main(String[] args) {
        File file = new File("C:\\data.txt");
        try {
            String text = Files.readString(Path.of("C:\\data.txt"));
            System.out.println(text);
            System.out.println(text.toUpperCase());
        } catch (IOException e) {
            throw new RuntimeException(e);

        }}}