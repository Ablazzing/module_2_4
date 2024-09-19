package org.javaacademy.lesson8.ex2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Parent parent1 = new Parent(List.of(new Child("Петр", 15), new Child("Федя", 10)));
        Parent parent2 = new Parent(List.of(new Child("Аня", 2), new Child("Маша", 18)));
        List<Parent> parentList = List.of(parent1, parent2);

        parentList.stream()
                .flatMap(parent -> parent.getChildList().stream())
                .sorted((child1, child2) -> child1.getAge().compareTo(child2.getAge()))
                .forEach(child -> System.out.println(child));

//        System.out.println("___________________________________________");
//        parentList.stream().map(parent -> parent.getChildList())
//                .forEach(child -> System.out.println(child));
    }
}
