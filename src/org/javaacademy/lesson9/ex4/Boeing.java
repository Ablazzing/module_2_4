package org.javaacademy.lesson9.ex4;

public class Boeing implements Flyable, Drive {
    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }

    @Override
    public void go() {
        System.out.println("Самолет едет");
    }
}
