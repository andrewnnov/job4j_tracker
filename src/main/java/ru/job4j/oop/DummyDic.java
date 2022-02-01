package ru.job4j.oop;

public class DummyDic {

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        System.out.println(dummyDic.engToRus("бла-бла-бла"));
    }

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }
}
