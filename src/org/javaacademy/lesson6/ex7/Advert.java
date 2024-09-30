package org.javaacademy.lesson6.ex7;

import java.math.BigDecimal;

/**
 * Объявление
 */
public class Advert {
    private final String text;
    private final BigDecimal price;

    public Advert(String text, BigDecimal price) {
        this.text = text;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Advert{" +
               "text='" + text + '\'' +
               ", price=" + price +
               '}';
    }

    public String getText() {
        return text;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
