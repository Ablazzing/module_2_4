package org.javaacademy.lesson8.ex5;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 7, 9);
        integers.stream().forEach(System.out::println);
        //System.out.printLn() -> method -> method.apply(e)

        integers.forEach(e -> System.out.println(e + " добавить текст"));

        Runnable runnable = System.out::println;

        //Class<Runner> runner = new Class(Runner)
        //Method method = runner.getMethod("main")
        //method.apply()
    }
}
