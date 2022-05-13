package ru.job4j.poly;

public class Bus implements Transport{

    public static int maxAmount = 40;
    public static double price = 45.3d;

    @Override
    public void go() {
        System.out.println("Поехали");
    }

    @Override
    public void numberOfPassengers(int amount) {
        if (amount > maxAmount) {
            System.out.println("Не поедем");
        } else {
            System.out.println("Погнали");
        }

    }

    @Override
    public double getFuel(int litres) {

        return price * litres;
    }
}
