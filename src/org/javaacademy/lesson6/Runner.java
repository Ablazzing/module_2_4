package org.javaacademy.lesson6;

import java.util.Random;

public class Runner {

    public static void main(String[] args) {
        System.out.println(substring("text"));
        System.out.println(substring(null));

    }

    /**
     * Чистая ли функция?
     */
    private static String substring(String text) {
        return new Random().nextInt() + "";
    }

    private static void printSquare(int number) {
        System.out.println(makeSquare(number));
    }

    private static int makeSquare(int number) {
        return number * number;
    }

    /**
     * Чистая ли функция?
     */
    private static int[] calc(int a, int b) {
        int[] array = new int[1];
        array[0] = a + b;
        return array;
    }


}
