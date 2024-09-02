package org.javaacademy.lesson3.train;

public class Runner {
    public static void main(String[] args) {
        Wagon wagon = new Wagon(WagonType.PASSENGER, 1);
        Train train = new Train(wagon);
        Wagon wagon2 = new Wagon(WagonType.PASSENGER, 2);
        train.addLast(wagon2);
        Wagon wagon3 = new Wagon(WagonType.PASSENGER, 3);
        train.addLast(wagon3);
        Wagon wagon4 = new Wagon(WagonType.PASSENGER, 4);
        train.addLast(wagon4);
        Wagon wagon5 = new Wagon(WagonType.PASSENGER, 5);
        train.addLast(wagon5);
//        Wagon wagon6 = new Wagon(WagonType.PASSENGER, 6);
//        train.addFirst(wagon6);
        System.out.println(train.getFromStartByIndex(2));

        int[] numbers = {1, 2, 3, 4, 5};
        int lastIndex = numbers.length - 1;
    }
}
