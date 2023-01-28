package Lesson11Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Doctors {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        result.add("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra");
        result.add("Przychodnia:Pediatra");
        result.add("Przychodnia:Internista:Laryngolog:Pediatra");

        List<String> collect = result.stream()
                .flatMap(i -> Stream.of(i.split(":")))
                .filter(i -> !Objects.equals(i, "Szpital") && !Objects.equals(i, "Przychodnia"))
                .distinct()
                .collect(Collectors.toList());

        System.out.print(String.join(", ", collect));

    }
}