package org.javaacademy.homework.homework3.ex1;

import java.util.function.Supplier;

@FunctionalInterface
public interface Garden<T extends Fruit> extends Supplier<T> {
}
