package Lesson10Task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void isPasswordCorrect(String password) {

        Pattern pattern = Pattern.compile("^(?=.*[A-Z].*)(?=.*\\d.*)(?!.*%s.*)(?!.*%s.*)\\w{7,}$");
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.matches();
        if (!matches){
            throw new  IllegalArgumentException ("Niepoprawy format hasla");
        }
    }
}
