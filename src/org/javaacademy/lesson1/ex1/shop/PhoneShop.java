package org.javaacademy.lesson1.ex1.shop;


import org.javaacademy.lesson1.ex1.product.Phone;

public class PhoneShop extends ProductShop {
//    private Phone phone;
//
//    /**
//     * Покупка магазином телефона
//     */
//    public void buy(double priceForBuy) {
//        phone = new Phone(priceForBuy);
//    }
//
//    /**
//     * Продаем покупателю
//     */
//    public Phone sell(double money) {
//        if (phone == null) {
//            throw new RuntimeException("Нет велосипеда для продажи");
//        }
//        if (phone.getPrice() <= money) {
//            Phone temp = phone;
//            phone = null;
//            return temp;
//        }
//        throw new RuntimeException("Денег не достаточно для покупки велосипеда");
//    }
}
