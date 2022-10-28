package ru.job4j.oop;

public class Child extends Parent {

    private String patronymic;

    public Child(String name, int age, String patronymic) {
        super(name, age);

    }

    public Child(String patronymic) {
        this.patronymic = patronymic;
    }

}
