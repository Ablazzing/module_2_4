package org.javaacademy.lesson1.ex1.product;

/**
 * Телефон
 */
public class Phone extends Product {

    public Phone(double price) {
        super(price);
    }

    public void call() {
        System.out.println("Телефон звонит");
    }

}
