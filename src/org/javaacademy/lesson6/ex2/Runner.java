package org.javaacademy.lesson6.ex2;

import org.javaacademy.lesson6.ex2.car.Audi;
import org.javaacademy.lesson6.ex2.car.Bmw;
import org.javaacademy.lesson6.ex2.car.Car;
import org.javaacademy.lesson6.ex2.factory.AudiFactory;
import org.javaacademy.lesson6.ex2.factory.BmwFactory;
import org.javaacademy.lesson6.ex2.factory.CarFactory;

import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        BmwFactory bmwFactory = new BmwFactory();
        Car audi = audiFactory.makeCar();
        Car bmw = bmwFactory.makeCar();
        System.out.println(audi);
        System.out.println(bmw);

        Supplier<Car> audiFunctionalFactory = () -> {
            System.out.println("Ауди создается");
            return new Audi();
        };
        CarFactory bmwFunctionalFactory = () -> new Bmw();
        Car audi2 = audiFunctionalFactory.get();
        System.out.println(audi2);

    }
}
