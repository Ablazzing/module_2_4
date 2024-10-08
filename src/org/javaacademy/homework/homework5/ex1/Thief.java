package org.javaacademy.homework.homework5.ex1;

import java.lang.reflect.Field;
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
        try {
            Field bankMoneyField = bank.getClass().getDeclaredField("money");
            bankMoneyField.setAccessible(true);
            BigDecimal bankMoney = (BigDecimal) bankMoneyField.get(bank);
            bankMoneyField.set(bank, BigDecimal.ZERO);
            this.money = this.money.add(bankMoney);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Thief{" +
               "money=" + money +
               '}';
    }
}
