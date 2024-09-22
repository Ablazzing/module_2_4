package org.javaacademy.homework.homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatRuler = (boat) -> boat.getLength();
        Ruler<Animal> animalRuler = (animal) -> animal.getBodyLength() + animal.getTailLength();

        Boat boat = new Boat(800);
        Animal animal = new Animal(100, 20);

        System.out.println("Длина лодки: " + boatRuler.apply(boat));
        System.out.println("Общая длина животного: " + animalRuler.apply(animal));
    }
}
