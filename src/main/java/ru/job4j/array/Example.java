package ru.job4j.array;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        int index = 1;
        String[] result = {"Andrey", "Fedor", "Stepan", "Vasya"};
        System.out.println(Arrays.toString(result));
        System.arraycopy(result, index + 1, result, index, result.length - 1 - index);
        result[result.length - 1] = null;
        System.out.println(Arrays.toString(result));

    }

}
