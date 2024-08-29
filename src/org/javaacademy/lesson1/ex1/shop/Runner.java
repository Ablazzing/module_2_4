package org.javaacademy.lesson1.ex1.shop;


import org.javaacademy.lesson1.ex1.product.Bicycle;
import org.javaacademy.lesson1.ex1.product.Phone;
import org.javaacademy.lesson1.ex1.product.Product;

public class Runner {
    public static void main(String[] args) {
        BicycleShop shop = new BicycleShop();
        shop.buy(new Bicycle(7_000));
        Product bicycle = shop.sell(10_000);
        System.out.println(bicycle);

        PhoneShop phoneShop = new PhoneShop();
        phoneShop.buy(new Phone(1000));
        Product phone = phoneShop.sell(2000);
        if ((Phone) phone instanceof Phone) {
            ((Phone) phone).call();
        }

        ProductShopGeneric<Phone> phoneShop2 = new ProductShopGeneric<>();
        phoneShop2.buy(new Phone(1000));
        Phone phone1 = phoneShop2.sell(2000);
        phone1.call();

        ProductShopGeneric<Product> productProductShopGeneric = new ProductShopGeneric<>();
    }
}
