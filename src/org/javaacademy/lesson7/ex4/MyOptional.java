package org.javaacademy.lesson7.ex4;

public class MyOptional {
    private String value;

    private MyOptional(String value) {
        this.value = value;
    }

    public static MyOptional ofNullable(String value) {
        return new MyOptional(value);
    }

    public static MyOptional of(String value) {
        if (value == null) {
            throw new RuntimeException("Нельзя кидать null через этот метод в optional");
        }
        return new MyOptional(value);
    }

    public String orElse(String anotherValue) {
        if (value != null) {
            return value;
        }
        return anotherValue;
    }

    @Override
    public String toString() {
        return "MyOptional{" +
               "value='" + value + '\'' +
               '}';
    }

    public String orElseOrThrow() {
        if (value == null) {
            throw new RuntimeException("Тут у нас null!");
        }
        return value;
    }
}
