package org.example;

public class BubbleSort<T extends Comparable<T>> {
    public void sort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int i = 0; i < n - 1; i++) {
                if (list.get(j).compareTo(list.get(i + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}