package org.javaacademy.lesson7.ex4;

import java.util.List;
import java.util.Optional;

public class Runner2 {
    public static void main(String[] args) {
        List<String> names = List.of();
        Optional<String> nameOptional = names.stream().findFirst();
        System.out.println(nameOptional.orElseThrow());
    }
}
