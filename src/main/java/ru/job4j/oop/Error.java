package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Актив: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error errorDefault = new Error();
        errorDefault.printInfo();

        Error errorWithConst = new Error(true, 1, "Ошибка");
        errorWithConst.printInfo();

        Error errorWithConst2 = new Error(false, 0, "Ошибка Загрузки");
        errorWithConst2.printInfo();
    }
}
