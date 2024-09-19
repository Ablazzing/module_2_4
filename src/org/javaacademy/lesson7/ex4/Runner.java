package org.javaacademy.lesson7.ex4;

import java.util.Optional;

public class Runner {
    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable(null);
        MyOptional myOptional = MyOptional.ofNullable(null);
        //String value = myOptional.orElseOrThrow();


        System.out.println(myOptional.orElse("").contains("П"));
    }
}
