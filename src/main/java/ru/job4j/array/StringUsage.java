package ru.job4j.array;

public class StringUsage {
    public static void main(String[] args) {

        validatePhone("123456789");
        validatePhone("123-456-789");

    }

    public static void validatePhone(String phone) {
        boolean valid = true;
        for (int i = 0; i < phone.length(); i++) {
            int code = phone.codePointAt(i);
            if (code < 48 || code > 57) {
                valid = false;
                break;
            }
        }
        System.out.println(phone + " is " + ((valid) ? "correct" : "not correct"));
    }
}
