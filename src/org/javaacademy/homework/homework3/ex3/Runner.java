package org.javaacademy.homework.homework3.ex3;

public class Runner {
    public static void main(String[] args) {
        Burn<Uran> nuclearReactor = uran -> System.out.println("зеленый свет вокруг!");
        Burn<Wood> bonfire = wood -> System.out.println("желто-красный свет вокруг!");

        Uran uran = new Uran();
        Wood wood = new Wood();
        nuclearReactor.accept(uran);
        bonfire.accept(wood);
    }
}
