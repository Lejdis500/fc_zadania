package Lesson6Task8;

public class PeselValidator {

    public static void main(String[] args) {
        validatePesel("90111112341");
    }

    public static void validatePesel(String pesel) {
        try {
            Long.parseLong(pesel);
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDateException("Niezgodny typ danych");
        }
        if (pesel.length() != 11) {
            throw new IllegalLengthException("Nieprawidlowa liczba znaków");
        }
    }
}