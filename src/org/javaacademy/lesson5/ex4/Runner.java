package org.javaacademy.lesson5.ex4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Runner {
    public static void main(String[] args) {
        //Сортируются значения
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(170, "Иванов");
        treeMap.put(167, "Петров");
        treeMap.put(180, "Сидоров");
        System.out.println(treeMap);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());

        //Поддерживается порядок вставки
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(170, "Иванов");
        linkedHashMap.put(167, "Петров");
        linkedHashMap.put(180, "Сидоров");

        System.out.println(linkedHashMap);

        System.out.println("Печать роста всех студентов");
        for (Integer height : linkedHashMap.keySet()) {
            System.out.println(height);
        }

        System.out.println("Печать всех фамилий");
        for (String studentName : linkedHashMap.values()) {
            System.out.println(studentName);
        }

        //Итерируемся по мапе
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
