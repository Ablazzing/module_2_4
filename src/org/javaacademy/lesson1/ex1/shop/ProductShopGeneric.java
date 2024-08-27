package org.javaacademy.lesson1.ex1.shop;

import org.javaacademy.lesson1.ex1.product.Product;

public class ProductShopGeneric <T extends Product> {
    private T product;

    /**
     * Покупка магазином велосипеда
     */
    public void buy(T product) {
        this.product = product;
    }

    /**
     * Продаем покупателю
     */
    public T sell(double money) {
        if (product == null) {
            throw new RuntimeException("Нет велосипеда для продажи");
        }
        if (product.getPrice() <= money) {
            T temp = product;
            product = null;
            return temp;
        }
        throw new RuntimeException("Денег не достаточно для покупки велосипеда");
    }
}
