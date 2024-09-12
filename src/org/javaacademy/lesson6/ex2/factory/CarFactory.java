package org.javaacademy.lesson6.ex2.factory;

import org.javaacademy.lesson6.ex2.car.Car;

@FunctionalInterface
public interface CarFactory {

    Car makeCar();
}
