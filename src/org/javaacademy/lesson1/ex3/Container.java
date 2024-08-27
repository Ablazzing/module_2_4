package org.javaacademy.lesson1.ex3;

public class Container <T> {
    private T value1;
    private T value2;
    private T value3;

    public Container(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    @Override
    public String toString() {
        return "Container{" +
               "value1=" + value1 +
               ", value2=" + value2 +
               ", value3=" + value3 +
               '}';
    }
}
