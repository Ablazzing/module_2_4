package org.javaacademy.lesson5.ex3;

import java.util.List;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        //Сортировка по росту
        Integer humanHeight1 = 160;
        Integer humanHeight2 = 170;
        Integer humanHeight3 = 180;
        Integer humanHeight4 = 150;

        //[150, 160, 160, 170, 180]
        //150
        //190

        //Сравнение двух значений
        //System.out.println(humanHeight4.compareTo(humanHeight2));

        List<Integer> humans = List.of(humanHeight1, humanHeight2, humanHeight3, humanHeight4);
        System.out.println(humans); // Без сортировки
        TreeSet<Integer> treeSet = new TreeSet<>(humans);
        System.out.println(treeSet); //После сортировки (по возрастанию)
        System.out.println(treeSet.descendingSet()); //Сортировка по убыванию

        //Сортировка студентов
        TreeSet<Student> students = new TreeSet<>(
                List.of(
                        new Student(160),
                        new Student(170),
                        new Student(180),
                        new Student(150)
                )
        );

        students.add(new Student(160));
        System.out.println(students);
//        long start = System.currentTimeMillis();
//        TreeSet<Integer> integers = new TreeSet<>();
//        for (int i = 0; i < 10_000_000; i++) {
//            integers.add(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println( end - start );
//
//        start = System.currentTimeMillis();
//        ArrayList<Integer> arrayList = new ArrayList<>(10_000_000);
//        for (int i = 0; i < 10_000_000; i++) {
//            arrayList.add(i);
//        }
//        arrayList.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        end = System.currentTimeMillis();
//        System.out.println( end - start );
    }
}
