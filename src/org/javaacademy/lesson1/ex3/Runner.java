package org.javaacademy.lesson1.ex3;

public class Runner {
    public static void main(String[] args) {
        Container<String> container = new Container<>("любой текст1", "ура", "освоили дженерики");
        System.out.println(container);
        Container<Integer> integerContainer = new Container<>(1, 2, 3);
        System.out.println(integerContainer);
    }
}
