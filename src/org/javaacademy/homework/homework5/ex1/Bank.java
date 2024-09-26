package org.javaacademy.homework.homework5.ex1;

import java.math.BigDecimal;

public class Bank {
    private BigDecimal money;

    private Bank(BigDecimal money) {
        this.money = money;
    }

    private void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Bank{" +
               "money=" + money +
               '}';
    }
}
