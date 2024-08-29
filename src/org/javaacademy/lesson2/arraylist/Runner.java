package org.javaacademy.lesson2.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        //Добавление нового числа в начало (add) - сложность O(n)
        int[] ints1 = {10, 5, 4, 2, 1};
        int[] ints1Copy = new int[6];
        for (int i = 0; i < ints1.length; i++) {
            ints1Copy[i + 1] = ints1[i];
        }

        //Изменение значения в ячейке (set) - Сложность О(1)
        //[ 16, 10, 5, 4, 2, 1, 15, null]
        int[] ints = {16, 10, 5, 4, 2, 1, 15};
        ints[0] = 17;

        //Изменение времени работы вставки в зависимости от реализации
        long timeStart = System.currentTimeMillis();

        ArrayList<Integer> integers1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> integers = new LinkedList<>(integers1);

        for (int i = 0; i < 1_000_000; i++) {
            integers.add(0, i);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("Время работы составило: " + (timeEnd - timeStart));
    }
}
