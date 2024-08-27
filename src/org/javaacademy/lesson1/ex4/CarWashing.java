package org.javaacademy.lesson1.ex4;

public class CarWashing {
    private int money = 0;

    public <T extends Car> T wash(T car) {
        car.setClean(true);
        money += 1000;
        return car;
    }

    public <T extends Car> T sellCar(Class<T> tClass) {
        try {
            return tClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Увы не получилось");
        }
    }

}
