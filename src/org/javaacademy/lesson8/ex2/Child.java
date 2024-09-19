package org.javaacademy.lesson8.ex2;

public class Child {
    private String name;
    private Integer age;

    public Child(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Child{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
