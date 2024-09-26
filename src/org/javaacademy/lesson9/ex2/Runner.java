package org.javaacademy.lesson9.ex2;

public class Runner {

    public static void main(String[] args) {
        Animal animal = new Animal(9);
        FlyAnimal flyAnimal = new FlyAnimal(9);
        Animal cheetah = new Cheetah(9);
//        cheetah.run();

        Animal[] animals = {cheetah, flyAnimal};
        for (Animal el : animals) {
            el.run();
        }


    }
}
