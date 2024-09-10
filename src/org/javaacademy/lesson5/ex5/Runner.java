package org.javaacademy.lesson5.ex5;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        HashMap<String, Integer> warehouse = new HashMap<>();
        warehouse.put("Яблоки", 10);
        warehouse.put("Помидоры", 15);

        warehouse.put("Яблоки", warehouse.get("Яблоки") + 20);

        addFruit("Персик", 30, warehouse);
        System.out.println(warehouse);
    }

    private static void addFruit(String fruit, Integer count, Map<String, Integer> warehouse) {
        warehouse.put(fruit, warehouse.getOrDefault(fruit, 0) + count);
        //Аналог
//        if (warehouse.containsKey(fruit)) {
//            warehouse.put(fruit, warehouse.get(fruit) + count);
//        } else {
//            warehouse.put(fruit, count);
//        }
    }
}
