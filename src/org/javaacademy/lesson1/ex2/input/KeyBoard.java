package org.javaacademy.lesson1.ex2.input;

/**
 * Клавиатура
 */
public class KeyBoard implements Input {

    public void input() {
        System.out.println("Ввод через клавиатуру");
    }

    public void escape() {
        System.out.println("Выход по кнопке escape");
    }
}
