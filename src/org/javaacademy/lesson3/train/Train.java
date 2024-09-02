package org.javaacademy.lesson3.train;

/**
 * Поезд
 */
public class Train {
    private WagonType wagonType; // поезд типа
    private Wagon first;
    private Wagon last;

    public Train(Wagon wagon) {
        this.wagonType =  wagon.getWagonType();
        this.first = wagon;
        this.last = wagon;
    }

    /**
     * Добавление вагона в конец поезда
     */
    public void addLast(Wagon newWagon) {
        this.last.setNext(newWagon);
        newWagon.setPrev(this.last);
        this.last = newWagon;
    }

    /**
     * Добавление вагона в начало поезда
     */
    public void addFirst(Wagon newWagon) {
        this.first.setPrev(newWagon);
        newWagon.setNext(this.first);
        this.first = newWagon;
    }

    public Wagon getFromStartByIndex(int index) {
        Wagon temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public Wagon getFromEndByIndex(int index) {
        Wagon temp = last;
        for (int i = 0; i < index; i++) {
            temp = temp.getPrev();
        }
        return temp;
    }
}
