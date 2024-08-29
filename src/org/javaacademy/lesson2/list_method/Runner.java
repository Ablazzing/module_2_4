package org.javaacademy.lesson2.list_method;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("Петр", "Дима", "Иван"));
        System.out.println("Получение элемента по индексом 1 : " + strings.get(1));

        strings.set(2, "Юрий");
        System.out.println(strings);

        System.out.println("Индекс Петра: " + strings.indexOf("Петр1"));

        //Получение среза из листа (лучше не пользоваться)
        List<String> subList = new ArrayList<>(strings.subList(0, 2));
        System.out.println(subList);
        //Изменение значения в листе
        subList.set(0, "Женя");
        System.out.println(strings);

        List<String> list = List.of("Гена");
        list.set(0, "Юрий");

        List<String> strings1 = new ArrayList<>(list);

    }
}
