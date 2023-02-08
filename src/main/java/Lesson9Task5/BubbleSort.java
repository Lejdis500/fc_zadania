package Lesson9Task5;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("C", "B", "A"));
        BubbleSort<String> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(words);
        System.out.println(words);
    }

    public void sort(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}