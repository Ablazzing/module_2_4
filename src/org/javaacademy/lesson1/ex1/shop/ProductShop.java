package org.javaacademy.lesson1.ex1.shop;

import org.javaacademy.lesson1.ex1.product.Product;

public abstract class ProductShop {
    private Product product;

    /**
     * Покупка магазином велосипеда
     */
    public void buy(Product product) {
        this.product = product;
    }

    /**
     * Продаем покупателю
     */
    public Product sell(double money) {
        if (product == null) {
            throw new RuntimeException("Нет велосипеда для продажи");
        }
        if (product.getPrice() <= money) {
            Product temp = product;
            product = null;
            return temp;
        }
        throw new RuntimeException("Денег не достаточно для покупки велосипеда");
    }
}
