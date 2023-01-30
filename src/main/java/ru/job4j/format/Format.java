package ru.job4j.format;

public class Format {

    public static void getGreeting(String name, int age) {
        System.out.println(String.format("Привет! Я %s, мне %d лет", name, age));
    }

    public static void main(String[] args) {
        getGreeting("Елена", 18);
    }
}
