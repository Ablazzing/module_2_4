package org.javaacademy.lesson5.ex3;

public class Student implements Comparable<Student> {
    private int height;

    public Student(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Student o) {
        if (this.height > o.height) {
            return 1;
        } else if (this.height < o.height) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
               "height=" + height +
               '}';
    }
}
