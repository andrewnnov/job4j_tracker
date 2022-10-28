package ru.job4j.ex;

public class Find {

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String rsl = Find.get(data, 7);
        System.out.println(rsl);

    }

    public static String get(String[] data, int index) {
        if (index <= 0 || index >= data.length) {
            throw  new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }
}
