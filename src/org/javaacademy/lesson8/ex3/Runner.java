package org.javaacademy.lesson8.ex3;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger(0);
        Stream.generate(() -> number.addAndGet(1)).limit(100).forEach(e -> System.out.println(e));
        System.out.println(number);

        String text = "";
        StringBuffer buffer = new StringBuffer();

    }
}
