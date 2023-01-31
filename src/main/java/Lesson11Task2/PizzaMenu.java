package Lesson11Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PizzaMenu {
    public static void main(String[] args) {
        List<Pizza> menu = Arrays.asList(
                new Pizza(true, Arrays.asList("mozarella", "pieczarki", "papryka", "pomidor"), 500, "wegetarianska"),
                new Pizza(true, Arrays.asList("mozarella", "pieczarki", "cebula"), 350, "cebulowa"),
                new Pizza(true, Arrays.asList("mozarella", "pomidor", "papryka"), 320, "pomidorowa"),
                new Pizza(true, Arrays.asList("mozarella", "papryka", "pomidor"), 380, "paprykowa"),
                new Pizza(false, Arrays.asList("mozarella", "salami", "cebula", "seler"), 400, "miesna"),
                new Pizza(false, Arrays.asList("mozarella", "pieczarki", "pomidor", "papryka", "seler"), 480,
                        "wegetaianska"),
                new Pizza(false, Arrays.asList("mozarella", "salami", "papryka", "seler"), 550, "wypasiona"),
                new Pizza(false, Arrays.asList("mozarella", "pieczarki", "pomidor", "papryka"), 520, "pieczarkowa"),
                new Pizza(false, Arrays.asList("mozarella", "salami"), 400, "firmowa"),
                new Pizza(false, Arrays.asList("mozarella", "papryka", "seler"), 500, "paprykowa")
        );
        menu.stream()
                .filter(Pizza::isVegetarian)
                .map(Pizza::getName)
                .forEach(System.out::println);
        menu.stream()
                .filter(pizza -> pizza.getIngredients().contains("seler"))
                .map(Pizza::getName)
                .forEach(System.out::println);
        if (menu.stream()
                .filter(pizza -> pizza.isVegetarian() && pizza.getIngredients().contains("papryka")
                        && pizza.getIngredients().contains("pomidor"))
                .findAny()
                .isPresent()) {
            System.out.println("Istnieje co najmniej jedna pizza wegetariańska, zawierająca pomidora i paprykę");
        } else {
            System.out.println("Nie istnieje  pizza wegetariańska, zawierająca pomidora i paprykę");
        }
        if (menu.stream().allMatch(pizza -> pizza.getIngredients().contains("mozarella"))) {
            System.out.println("Kazda pizza zawiera mozzarelle");
        } else {
            System.out.println("Nie kazda pizza zawiera mozzarelle");
        }
        Pizza pizzaMaxCalories = menu.stream()
                .max(Comparator.comparingInt(Pizza::getCalories))
                .get();
        System.out.println("Pizza o najwyzszej kalorycznosci:" + pizzaMaxCalories.getName());
        Pizza pizzaMinCalories = menu.stream()
                .min(Comparator.comparingInt(Pizza::getCalories))
                .get();
        System.out.println("Pizza o najnizszej kalorycznosci:" + pizzaMinCalories.getName());
    }
}