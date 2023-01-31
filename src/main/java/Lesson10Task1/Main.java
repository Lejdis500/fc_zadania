package Lesson10Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/*

Main -> PhoneBook
phoneList nie powinno byc statyczne
List -> Map
brak metody get zwracajacej Person na podstawie imienia i nazwiska (phoneBook.get("Patrycja Wójcik"))

 */

public class Main {
    public static List<Person> phoneList;

    // public final Map<String, Person> phones = ...
    // key: firstname + lastname
    // value Person

    public static void loadData() throws IOException {
        Path path = Paths.get("src/main/resources/phones.txt");
        List<String> strings = Files.readAllLines(path);
        phoneList = strings.stream()
                .map(Person::of)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        loadData();

        for (int i = 0; i < phoneList.size(); i++) {
            Person person = phoneList.get(i);
            System.out.println(person);
        }
    }
}