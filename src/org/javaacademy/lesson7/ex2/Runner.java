package org.javaacademy.lesson7.ex2;

import java.util.List;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<String> names = List.of("Петр", "Иван", "Федя");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("___________________________________________");

        //names.stream().forEach(e -> System.out.println(e));
        names.stream()
                .filter(e -> e.substring(0, 1).equals("П"))
                .forEach(e -> System.out.println(e));

        Stream.of("Анбу".split("")).forEach(e -> System.out.println(e));


//        for (String name : names) {
//            if (name.substring(0, 1).equals("П")) {
//                System.out.println(name);
//            }
//        }


    }
}
