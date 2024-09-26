package org.javaacademy.lesson9.ex1;

public class Car {
    private int countFuel;

    public Car(int countFuel) {
        this.countFuel = countFuel;
    }

    public void startCar() {
        if (countFuel > 0) {
            System.out.println("Машина завелась");
        }
    }
}
