package org.javaacademy.homework.homework5.ex1;

import java.math.BigDecimal;

/**
 * Вор
 */
public class Thief {
    private BigDecimal money;

    private Thief() {
        this.money = BigDecimal.ZERO;
    }

    private void stealMoney(Bank bank) {
        //??
    }

    @Override
    public String toString() {
        return "Thief{" +
               "money=" + money +
               '}';
    }
}
