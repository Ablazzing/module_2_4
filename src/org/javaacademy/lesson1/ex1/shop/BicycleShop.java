package org.javaacademy.lesson1.ex1.shop;


import org.javaacademy.lesson1.ex1.product.Bicycle;

public class BicycleShop extends ProductShop {
//    private Bicycle bicycle;
//
//    /**
//     * Покупка магазином велосипеда
//     */
//    public void buy(double priceForBuy) {
//        bicycle = new Bicycle(priceForBuy);
//    }
//
//    /**
//     * Продаем покупателю
//     */
//    public Bicycle sell(double money) {
//        if (bicycle == null) {
//            throw new RuntimeException("Нет велосипеда для продажи");
//        }
//        if (bicycle.getPrice() <= money) {
//            Bicycle temp = bicycle;
//            bicycle = null;
//            return temp;
//        }
//        throw new RuntimeException("Денег не достаточно для покупки велосипеда");
//    }

}
