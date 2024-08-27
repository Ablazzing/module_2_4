package org.javaacademy.lesson1.ex2;

import org.javaacademy.lesson1.ex2.input.Input;
import org.javaacademy.lesson1.ex2.output.Output;

public class Computer <I extends Input, O extends Output> {
    private I inputObject;
    private O outputObject;

    public Computer(I inputObject, O outputObject) {
        this.inputObject = inputObject;
        this.outputObject = outputObject;
    }

    public void input() {
        inputObject.input();
    }

    public void show() {
        outputObject.show();
    }

    public I getInputObject() {
        return inputObject;
    }

    public O getOutputObject() {
        return outputObject;
    }
}
