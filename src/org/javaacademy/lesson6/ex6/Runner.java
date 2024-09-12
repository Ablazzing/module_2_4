package org.javaacademy.lesson6.ex6;

import java.util.Random;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
        Supplier<String> terminal = () -> new Random().nextInt(1000) + "A";
        System.out.println(terminal.get());
        System.out.println(terminal.get());
        System.out.println(terminal.get());
        System.out.println(terminal.get());
    }
}
