package org.javaacademy.lesson6.ex3;

import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        MathOperation sumOperation = (number1, number2) -> number1 + number2;
        MathOperation subtractOperation = (number1, number2) -> number1 - number2;

        System.out.println(sumOperation.makeOperation(10, 20));

        //double makeOperation(double number1, double number2);

        //Четное или не четное число
        Predicate<Double> isEvenChecker = (number) -> number % 2 == 0;

        //Больше 10 или меньше 10
        Predicate<Double> isBiggerTet = (number) -> number >= 10;

        System.out.println(isEvenChecker.test(25d));
        System.out.println(isBiggerTet.test(12d));
    }
}
