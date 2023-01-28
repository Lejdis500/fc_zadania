package Lesson10Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    private static final Pattern peselPattern = Pattern.compile("^\\d{11}$");

    public static void validate(String pesel) {
        Matcher matcher = peselPattern.matcher(pesel);
        boolean result = matcher.matches();
        if (!result) {
            throw new IllegalArgumentException("Niepoprawny format peselu");
        }
    }
}