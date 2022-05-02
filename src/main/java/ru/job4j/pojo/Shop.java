package ru.job4j.pojo;

public class Shop {

    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);

        Product[] prods = new Product[5];
        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;

        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
        System.out.println();

        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        prods[0] = oil;

        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
        System.out.println();

        System.out.println("Shown only product.count > 10");
        for (int index = 0; index < prods.length; index++) {
            Product pr = prods[index];
            if (pr != null && pr.getCount() > 10) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
        System.out.println();

        System.out.println("Index of first empty item = " + indexOfNull(prods));

    }

    public static int indexOfNull(Product[] products) {
        for (int index = 0; index < products.length; index++) {
            if (products[index] == null) {
                return index;
            }
        }
        return -1;
    }
}
