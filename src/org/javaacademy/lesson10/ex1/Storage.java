package org.javaacademy.lesson10.ex1;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<? super Product> products = new ArrayList<>();

    public Storage(List<? extends Product> newProducts) {
        for (Product newProduct : newProducts) {
            products.add(newProduct);
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProductByIndex(int index) {
        return (Product) products.get(index);
    }
}
