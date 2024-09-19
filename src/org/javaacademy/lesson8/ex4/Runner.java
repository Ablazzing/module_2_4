package org.javaacademy.lesson8.ex4;

import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //Создание стрима
        Stream<Integer> stream = Stream.of(1, 2, 3, 5);
        //stream.forEach(e -> System.out.println(e));

        Stream<Integer> stream2 = Stream.of(8, 10);
        //Объединение двух стримов
        Stream.concat(stream, stream2).forEach(e -> System.out.println(e));
    }
}
