package org.javaacademy.lesson9.ex5;

import java.util.Comparator;
import java.util.TreeMap;

public class Runner {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>(Comparator.comparingInt(String::length).thenComparing(String::hashCode));
        Shop shop = new Shop(map);
        shop.addProduct("яблоки", 10);
        shop.addProduct("яблоки", 20);
        shop.addProduct("финики", 20);
        shop.addProduct("апельсины", 20);
        shop.getProducts().forEach((key, value) -> System.out.println(key + " " + value));
    }
}
