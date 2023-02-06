package Lesson10Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    private static final Pattern PESEL_PATTERN = Pattern.compile("^\\d{11}$");

    public static void validate(String pesel) {
        Matcher matcher = PESEL_PATTERN.matcher(pesel);
        boolean result = matcher.matches();
        if (!result) {
            throw new IllegalArgumentException("Niepoprawny format peselu");
        }
        if (pesel.length() != 11) {
            throw new IllegalArgumentException("Pesel powinien miec 11 znaków");
        }
    }
}