package org.javaacademy.lesson6.ex5;

import java.time.LocalDate;
import java.util.function.Consumer;

public class Runner {
    public static void main(String[] args) {
        Consumer<LocalDate> addDayAndPrint = date -> {
            LocalDate newDate = date.plusDays(1);
            System.out.println(newDate);
        };
        LocalDate today = LocalDate.now();
        addDayAndPrint.accept(today);
        //(t);
    }
}
