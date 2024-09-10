package org.javaacademy.lesson5.ex2;

import java.util.LinkedHashSet;

public class Runner {
    public static void main(String[] args) {
        //Уникальные значения сохраняющие порядок вставки
        LinkedHashSet<String> stations = new LinkedHashSet<>();
        stations.add("Станция №1");
        stations.add("Станция №2");
        stations.add("Станция №3");
        stations.add("Станция №3");
        System.out.println(stations);
    }
}
