package org.javaacademy.homework.homework4.ex3;

import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<SkyScraper> skyScrapers = List.of(
                new SkyScraper("Всемирный торговый центр", 541),
                new SkyScraper("Шанхайская башня", 632),
                new SkyScraper("Бурдж-Халифа", 828),
                new SkyScraper("Бурдж-Халифа", 828),
                new SkyScraper("Международный финансовый центр Пинань", 599),
                new SkyScraper("Абрадж аль-Бейт", 601),
                new SkyScraper("Всемирный центр Лотте", 555)
        );

        //4. С помощью стримов:
        //4.1 Убрать дубликаты и сохранить в новый лист (далее работаем с этим листом).
        List<SkyScraper> scraperListWithoutDuplicates = skyScrapers.stream().distinct().toList();

        //(РАЗНЫЕ СТРИМЫ!)
        //4.2. Вывести только первые три небоскреба.
        scraperListWithoutDuplicates.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("___________________________________________");

        //4.3. Вывести самый высокий небоскреб.
        scraperListWithoutDuplicates.stream()
                .max(Comparator.comparingInt(SkyScraper::getHeight))
                .ifPresent(System.out::println);
        System.out.println("___________________________________________");

        //4.4. Вывести те небоскребы, которые выше километра.
        //Если выше километра нет, то вывести на экран: небоскреба выше километра - нет.
        scraperListWithoutDuplicates.stream()
                .filter(skyScraper -> skyScraper.getHeight() > 1000)
                .peek(System.out::println)
                .toList()
                .stream()
                .findAny()
                .ifPresentOrElse(
                        (skyScraper -> {}),
                        () -> System.out.println("Небоскреба выше километра нет!"));
    }
}
