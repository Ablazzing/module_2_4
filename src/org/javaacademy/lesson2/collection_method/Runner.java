package org.javaacademy.lesson2.collection_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String[] names = {"Петр", "Юрий", "Евгений"};

        String[] namesBigger = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            namesBigger[i] = names[i];
        }
        namesBigger[names.length] = "Алексей";
        System.out.println(Arrays.toString(namesBigger));

        //ArrayList - класс из Коллекций
        ArrayList<String> namesList = new ArrayList<>(List.of(names));
        //Добавление значения
        namesList.add("Алексей");
        System.out.println(namesList);

        for (String name : namesList) {
            System.out.println(name);
        }
        System.out.println("___________________________________________");

        //Сырая типизация (не указан дженерик)
//        ArrayList objects = new ArrayList();
        ArrayList<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 10));
        System.out.println("Размер " + integers.size());
        System.out.println("Пустой ли список? " + integers.isEmpty());
        System.out.println("Содержит ли какое то значение? " + integers.contains(4));

        //Получение массивов
        Object[] array = integers.toArray();
        Integer[] array1 = integers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array1));

        //Добавление нового элемента
        integers.add(0, 11);
        System.out.println(integers);

        //Удаление элемента
        Boolean success = integers.remove(Integer.valueOf(12));
        System.out.println(success);
        System.out.println(integers);

        //Содержит все элементы или нет
        System.out.println("Содержит ли все числа или нет? "
            + integers.containsAll(List.of(4, 3, 11)));

        //Добавление новых чисел
        integers.addAll(List.of(1, 2, 3, 4, 5));
        System.out.println(integers);
        //Удаление списка чисел
        integers.removeAll(List.of(1, 2, 3, 4, 5));
        System.out.println(integers);

        //Пересечение значений
        ArrayList<Integer> firstList = new ArrayList<>(List.of(1, 5, 6, 7));
        ArrayList<Integer> secondList = new ArrayList<>(List.of(2, 5, 7, 10));
        firstList.retainAll(secondList);
        System.out.println(firstList);

        //Удаление всех элементов из коллекции
        integers.clear();
        System.out.println(integers);
    }
}
