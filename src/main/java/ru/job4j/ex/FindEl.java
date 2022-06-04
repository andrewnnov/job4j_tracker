package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException();
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] textArray = new String[]{"one", "two", "three"};
        String key = "one";

        try {
            indexOf(textArray, key);
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
