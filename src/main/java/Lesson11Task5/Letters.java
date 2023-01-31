package Lesson11Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Letters {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("programowanie", "java", "futurecollars");
        Set<Character> uniqueLetters = words.stream()
                .map(word -> word.toUpperCase())
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());
        System.out.println(uniqueLetters);

    }
}