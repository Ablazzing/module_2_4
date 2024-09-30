package org.javaacademy.homework.homework4.ex1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    private static final int COUNT_NUMBERS_IN_CAR_NUMBER = 3;
    private static final String FIRST_CAR_NUMBER_PATTERN = "а%sан799";
    private static final String SECOND_CAR_NUMBER_PATTERN = "к%sсе178";
    private static final int COUNT_CARS = 50;
    private static final int CAR_NUMBER_START_INDEX = 1;
    private static final int CAR_NUMBER_END_INDEX = 4;
    private static final int UPPER_LIMIT_GOVERNMENT_NUMBER = 49;
    private static final int LOWER_LIMIT_GOVERNMENT_NUMBER = 40;

    public static void main(String[] args) {
        Stream<Car> firstCarStream = generateCars(FIRST_CAR_NUMBER_PATTERN, COUNT_CARS);
        Stream<Car> secondCarStream = generateCars(SECOND_CAR_NUMBER_PATTERN, COUNT_CARS);
        Stream.concat(firstCarStream, secondCarStream)
                .map(Car::getNumber)
                .filter(Runner::isGovernmentEmployeeNumber)
                .forEach(System.out::println);
    }

    private static boolean isGovernmentEmployeeNumber(String number) {
        Integer carNumber = Integer.valueOf(number.substring(CAR_NUMBER_START_INDEX, CAR_NUMBER_END_INDEX));
        return  carNumber >= LOWER_LIMIT_GOVERNMENT_NUMBER
                && carNumber <= UPPER_LIMIT_GOVERNMENT_NUMBER;
    }

    private static Stream<Car> generateCars(String numberPattern, int countCars) {
        AtomicInteger carNumber = new AtomicInteger(0);
        return Stream.generate(() -> new Car(createNumber(numberPattern, carNumber.addAndGet(1))))
                .limit(countCars);
    }

    private static String createNumber(String numberPattern, Integer number) {
        String textNumber = "0"
                .repeat(COUNT_NUMBERS_IN_CAR_NUMBER - number.toString().length())
                .concat(number.toString());
        return numberPattern.formatted(textNumber);
    }

}
