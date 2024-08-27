package org.javaacademy.lesson1.ex2;

import org.javaacademy.lesson1.ex2.input.KeyBoard;
import org.javaacademy.lesson1.ex2.output.Monitor;

public class Runner {
    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard();
        Monitor monitor = new Monitor();
        Computer<KeyBoard, Monitor> computer = new Computer<>(keyBoard, monitor);
        computer.input();
        KeyBoard inputObject = computer.getInputObject();

        Monitor monitor1 = computer.getOutputObject();
        monitor1.show();

        inputObject.escape();
    }
}
