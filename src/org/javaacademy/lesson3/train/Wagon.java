package org.javaacademy.lesson3.train;

public class Wagon {
    private WagonType wagonType;
    private int number;
    private Wagon prev; // предыдущий вагон
    private Wagon next; // следующий вагон

    /**
     * Первый вагон
     */
    public Wagon(WagonType wagonType, int number) {
        this.wagonType = wagonType;
        this.number = number;
    }

    /**
     * Вагон по середине
     */
    public Wagon(WagonType wagonType, Wagon prev, Wagon next) {
        this.wagonType = wagonType;
        this.prev = prev;
        this.next = next;
    }

    /**
     * Последний вагон
     */
    public Wagon(WagonType wagonType, Wagon prev) {
        this.wagonType = wagonType;
        this.prev = prev;
    }

    public WagonType getWagonType() {
        return wagonType;
    }

    public void setPrev(Wagon prev) {
        this.prev = prev;
    }

    public void setNext(Wagon next) {
        this.next = next;
    }

    public Wagon getPrev() {
        return prev;
    }

    public Wagon getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Wagon{" +
               "number=" + number +
               ", wagonType=" + wagonType +
               '}';
    }
}
