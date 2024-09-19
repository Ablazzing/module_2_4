package org.javaacademy.lesson8.ex1;

public class Human {
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
               "age=" + age +
               '}';
    }
}
