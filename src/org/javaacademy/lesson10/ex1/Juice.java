package org.javaacademy.lesson10.ex1;

public class Juice extends Product {
    public Juice(Integer price) {
        super(price);
    }

    public void smell() {
        System.out.println("От сока идет запах");
    }
}
