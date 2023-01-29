package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }

        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        return "Yes";
    }

    public static boolean checkOneUpperCaseSymbol(String password) {

        boolean result = false;
        for (int i = 0; i < password.length(); i++) {
            int code = password.codePointAt(i);
            if (Character.isUpperCase(code)) {
                break;
            }
        }
        return true;
    }
}
