package org.javaacademy.lesson10.ex2;

public class Cat {
    private String catName;

    private Cat(String catName) {
        this.catName = catName;
    }

    @Time
    private void say() {
        long start = System.currentTimeMillis();
        System.out.println(catName + " мяукнул");
        long end = System.currentTimeMillis();
        System.out.println(start - end);
    }
}
