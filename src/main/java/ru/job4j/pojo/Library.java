package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book bookOne = new Book("Clean code", 100);
        Book bookTwo = new Book("Notion", 150);
        Book bookThree = new Book("Dirty code", 600);
        Book bookFour = new Book("NPM", 400);

        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println();

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        System.out.println("Replace book 0 and 3");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println();

        System.out.println("Choose only Clean code");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}
