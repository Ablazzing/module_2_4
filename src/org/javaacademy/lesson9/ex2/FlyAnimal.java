package org.javaacademy.lesson9.ex2;

public class FlyAnimal extends Animal {

    public FlyAnimal(int speed) {
        super(speed);
    }

    public void fly() {
        System.out.println("Животное летит");
    }

}
