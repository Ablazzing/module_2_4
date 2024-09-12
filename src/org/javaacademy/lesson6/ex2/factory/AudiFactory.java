package org.javaacademy.lesson6.ex2.factory;

import org.javaacademy.lesson6.ex2.car.Audi;
import org.javaacademy.lesson6.ex2.car.Car;

public class AudiFactory implements CarFactory {

    @Override
    public Car makeCar() {
        System.out.println("Ауди создается!");
        return new Audi();
    }
}
