package Lesson6Task8;

public class PeselValidator {
    public static void validatePesel(String pesel) {
        try {
            Long.parseLong(pesel);
        } catch (NumberFormatException e) {
            throw new WrongTypeDataException("Niezgodny typ danych");
        }
        if (pesel.length() != 11) {
            throw new IllegalLengthException("Nieprawidlowa liczba znaków")
        }}}