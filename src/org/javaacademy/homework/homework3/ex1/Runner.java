package org.javaacademy.homework.homework3.ex1;

public class Runner {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apricot apricot = new Apricot();
        Garden<Apple> appleGarden = () -> new Apple();
        Garden<Apricot> apricotGarden = () -> new Apricot();
        Apple grow = appleGarden.get();
        System.out.println(apricotGarden.get());
    }
}
