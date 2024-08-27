package org.javaacademy.lesson1.ex4;

public class Runner {
    public static void main(String[] args) {
        CarWashing carWashing = new CarWashing();
        LightCar lightCar = new LightCar();
        LightCar lightCar1 = carWashing.wash(lightCar);
        Bus bus = carWashing.wash(new Bus());

        Bus newBus = carWashing.sellCar(Bus.class);

    }
}
