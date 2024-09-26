package org.javaacademy.lesson9.ex1;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void startCar(Car car) {
        car.startCar();
    }

    public int getCountDaysLife() {
        return DateConvertorUtil.convertAgeToDays(this.age);
    }
}
