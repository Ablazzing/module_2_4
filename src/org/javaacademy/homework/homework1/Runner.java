package org.javaacademy.homework.homework1;

import org.javaacademy.homework.homework1.animal.Bird;
import org.javaacademy.homework.homework1.animal.Dog;
import org.javaacademy.homework.homework1.animal.Tiger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.ZERO;
import static java.math.BigDecimal.valueOf;
import static java.math.RoundingMode.HALF_UP;

public class Runner {
    public static void main(String[] args) {


        ex3();
    }

    public static void ex1() {
        //Задание №1 Зоопарк
        //1. Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять, Птица - умеет летать.
        //Общий родитель - животное (никаких атрибутов и методов в нем нет).
        //2. Создать зоопарк, который может хранить в себе 3 животных любого типа.
        //Т.е. могут быть следующие зоопарки:
        // Зоопарк в котором Тигр, Тигр, Птица
        // Зоопарк в котором Собака, Собака, Собака
        // Зоопарк в котором Птица, Птица, Тигр.
        //3. Сделать геттеры на всех животных.
        //Сделать так, чтобы при получении животного, мы могли воспользоваться специфичным для него действием.
        //Т.е. создали зоопарк Тигр, Собака, Птица (положили в этот зоопарк животных  при создании).
        //Получили первое животное (тигра) - вызвали у него рык
        //Получили второе животное (собака) - вызвали у него лай
        //Получили первое животное (птица) - вызвали у него полет
        //Запрещено пользоваться instanceOf.
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Bird bird = new Bird();
        Zoo<Dog, Tiger, Bird> zoo = new Zoo<>(dog, tiger, bird);
        zoo.doActionsForAllAnimals();
    }

    public static void ex2() {
        //Задание №2 Гидрометцентр
        //Создать две структуры данных, в которых будет статистика по дням (среднесуточная температура воздуха)
        //Январь: 0,-1,-1,-2,-5,-6,-7,-8,-9,-10,-5,-5,-2,-7,-3,-1,-8,-9,-8,-8,-18,-20,-23,-24,-25,-9,-8,-7,-6,-5,-1
        //Февраль: -8,-10,-12,-13,-15,-16,-12,-7,-8,-10,-10,-9,-8,-8,-8,-9,-10,-9,-5,-6,-8,-7,-8,-9,-6,-5,-3,-1
        //Объединить данные за январь и февраль, посчитать среднесуточную температуру воздуха за 2 месяца.
        //Запрещено использовать массивы.
        List<Integer> januaryTemperature = List.of(0, -1, -1, -2, -5, -6, -7, -8, -9, -10, -5, -5, -2,
                -7, -3, -1, -8, -9, -8, -8, -18, -20, -23, -24, -25, -9, -8, -7, -6, -5, -1);
        List<Integer> febraryTemperature = List.of(-8, -10, -12, -13, -15, -16, -12, -7, -8, -10, -10, -9,
                -8, -8, -8, -9, -10, -9, -5, -6, -8, -7, -8, -9, -6, -5, -3, -1);
        ArrayList<Integer> result = new ArrayList<>(januaryTemperature);
        result.addAll(febraryTemperature);
        BigDecimal sumTemperature = ZERO;
        for (Integer temperatureDay : result) {
            sumTemperature = sumTemperature.add(valueOf(temperatureDay));
        }
        System.out.println(sumTemperature.divide(valueOf(result.size()), 1, HALF_UP));
    }

    public static void ex3() {
        //Задание №3 Ресторанный гуру
        //Николай Петрович ходит по ресторанам. За 5 дней он был во множестве ресторанов.
        //Он обратился к вам, чтобы узнать в каком ресторане(ах) он был каждый день
        // (т.е. найти ресторан(ы) в которых он был и в понедельник, и во вторник, и в среду и тд).
        List<String> monday = List.of("Чебуречная №1", "Реберная", "Андерсон", "Ниппон", "Фо бо");
        List<String> tuesday = List.of("Вареничная №1", "Пушкин", "Чебуречная №1", "Ниппон", "Реберная");
        List<String> wednesday = List.of("Реберная", "Арарат", "Майя", "Ниппон", "Таксим");
        List<String> thursday = List.of("Грех", "Ваниль", "Реберная", "Пянсе", "Фо бо");
        List<String> friday = List.of("Бёрдс", "Реберная", "Андерсон", "Ниппон", "Чифанька");

        List<String> resultList = new ArrayList<>(monday);
        for (List<String> day : List.of(tuesday, wednesday, thursday, friday)) {
            resultList.retainAll(day);
        }
        System.out.println(resultList);
    }
}
