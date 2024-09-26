package org.javaacademy.lesson10.ex2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        //Cat cat = new Cat("Барсик");
        Cat cat = createCat("Барсик");
        printName(cat);
        sayMay(cat);

//        String hello = new String("hello");
//        Field value = String.class.getDeclaredField("value");
//        value.setAccessible(true);
//        Object byteValue = value.get(hello);
//        System.out.println(byteValue);
    }

    private static Cat createCat(String name) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Cat> catClass = Cat.class;
        Constructor<Cat> catConstructor = catClass.getDeclaredConstructor(String.class);
        catConstructor.setAccessible(true);
        Cat cat = catConstructor.newInstance(name);
        return cat;
    }

    private static void sayMay(Cat cat) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Cat> catClass = Cat.class;
        Method methodSay = catClass.getDeclaredMethod("say");
        methodSay.setAccessible(true);
        methodSay.invoke(cat);
    }

    private static void printName(Cat cat) throws IllegalAccessException {
        Class<Cat> catClass = Cat.class;
        for (Field field : catClass.getDeclaredFields()) {
            System.out.println(field.getName());
            field.setAccessible(true);
            Object catName = field.get(cat);
            System.out.println(catName);
        }
    }
}
