package org.javaacademy.lesson5.ex1;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        String number1 = "4001A2020";
        String number2 = "4002A2121";
        String number3 = "4003A2222";
        //Набор неуникальных значений
        List<String> passportNumbers = List.of(number1, number2, number3, number1);
        System.out.println(passportNumbers);
        Object object = new Object();
        Object object2 = "";
        System.out.println(Map.of(number1, object2, number2, object2, number3, object2));

        //Уникальные значения
        HashSet<String> setPassportNumbers = new HashSet<>(passportNumbers);
//        System.out.println(setPassportNumbers);
//        System.out.println(passportNumbers);
//        setPassportNumbers.add("4001A2020");
//        System.out.println(setPassportNumbers);
        for (String number : setPassportNumbers) {
            System.out.println(number);
        }
        //Содержит значение или нет
        System.out.println(setPassportNumbers.contains(number1));
    }
}
