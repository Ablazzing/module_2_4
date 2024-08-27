package org.javaacademy.lesson1.ex2.input;

/**
 * Мышь
 */
public class Mouse implements Input {

    public void input() {
        System.out.println("Мышь делает ввод");
    }

    public void scroll() {
        System.out.println("Крутим колесико");
    }
}
