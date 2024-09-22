package org.javaacademy.homework.homework3.ex2;

public class Runner {
    public static void main(String[] args) {
        Divination<String> chamomile = name -> name.length() % 2 == 0;
        Divination<Human> grandmaFortuneTeller = human -> (human.getAge() + human.getHeight()) > 210;

        String name = "Петр";
        System.out.println("Ромашка предсказала " + chamomile.test(name));

        Human human = new Human(20, 180);
        System.out.println("Бабка предсказала: " + grandmaFortuneTeller.test(human));
    }
}
