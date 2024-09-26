package org.javaacademy.lesson9.ex2;

public class Animal {
    protected int speed;

    public Animal(int speed) {
        this.speed = speed;
    }

    public void run() {
        if (speed < 10) {
            System.out.println("Животное ползет");
        } else {
            System.out.println("Животное бежит");
        }

    };

    public void breathe() {
        System.out.println("Животное дышит");
    }
}
