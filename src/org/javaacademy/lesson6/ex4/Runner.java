package org.javaacademy.lesson6.ex4;

import java.util.function.Function;
import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        Function<Girl, Boolean> convertToAge = (girl) -> girl.getAge() > 20;
        //Аналог
        Predicate<Girl> convertToAge2 = (girl) -> girl.getAge() > 20;
        Girl girl = new Girl(20);
        System.out.println(convertToAge.apply(girl));
    }
}
