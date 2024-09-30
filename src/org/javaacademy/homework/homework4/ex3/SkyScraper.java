package org.javaacademy.homework.homework4.ex3;

import java.util.Objects;

public class SkyScraper {
    private String name;
    private int height;

    public SkyScraper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        SkyScraper that = (SkyScraper) object;
        return height == that.height && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    @Override
    public String toString() {
        return "SkyScraper{" +
               "name='" + name + '\'' +
               ", height=" + height +
               '}';
    }
}
