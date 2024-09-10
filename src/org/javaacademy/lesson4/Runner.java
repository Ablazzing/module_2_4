package org.javaacademy.lesson4;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Child child = new Child("Иван", "Иванов", 2020);
        Child child2 = new Child("Иван", "Иванов", 2020);
        Child child5 = new Child("Аня", "Петрова", 2020);
//        System.out.println(child.equals(child2));
//
//        System.out.println(1992%3);

        Child child3 = new Child("Миша", "Козлов", 2021);
        Child child4 = new Child("Сергей", "Топтунов", 2022);
        Child child6 = new Child("Маша", "Свиридова", 2025);
        ChildGarden childGarden = new ChildGarden(10);
        childGarden.addChild(child);
        childGarden.addChild(child3);
        childGarden.addChild(child4);
        childGarden.addChild(child5);
        childGarden.addChild(child6);


        for (List<Child> group : childGarden.getGroups()) {
            System.out.println("Группа");
            System.out.println(group);
            System.out.println("___________________________________________");
        }

        //0 % 3 = 0
        //1 % 3 = 1
        //2 % 3 = 2
        //3 % 3 = 0
    }
}
