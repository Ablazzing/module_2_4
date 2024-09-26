package org.javaacademy.lesson9.ex6;

public class Computer {
    private Input input;

    public Computer(Input input) {
        this.input = input;
    }

    public void makeInput() {
        input.input();
    }
}
