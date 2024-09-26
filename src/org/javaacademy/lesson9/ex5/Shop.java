package org.javaacademy.lesson9.ex5;

import java.util.Map;

public class Shop {
    private Map<String, Integer> products;

    public Shop(Map<String, Integer> products) {
        this.products = products;
    }

    public void addProduct(String product, Integer countProduct) {
        products.put(product, products.getOrDefault( product, 0) + countProduct);
    }

    @Override
    public String toString() {
        return "Shop{" +
               "products=" + products +
               '}';
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
}
