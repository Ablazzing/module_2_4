package org.javaacademy.lesson6.ex7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.math.BigDecimal.valueOf;

public class Runner {
    public static void main(String[] args) {
        Advert advert1 = new Advert("Продается собака", valueOf(10_000));
        Advert advert2 = new Advert("Продается мотоцикл", valueOf(200_000));
        Advert advert3 = new Advert("Продается компьютер", valueOf(50_000));
        ArrayList<Advert> adverts = new ArrayList<>(List.of(advert1, advert2, advert3));
        Comparator<Advert> advertComparator = (adv1, adv2) -> adv1.getPrice().compareTo(adv2.getPrice());
        adverts.sort(advertComparator.reversed());
        System.out.println(adverts);
    }
}
