package org.javaacademy.lesson8.ex1;

import java.util.List;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);

        //Промежуточные операции
        //Filter - убирает элементы по условию
        System.out.println("Фильтр чисел которые больше 6");
        numbers.stream().filter(e -> e > 6).forEach(e -> System.out.print(e + " "));

        //Distinct - удаление дубликатов
        System.out.println("\nУдаление дубликатов");
        numbers.stream().distinct().forEach(e -> System.out.print(e + " "));

        //skip - Пропуск n элементов
        System.out.println("\nПропустить первые n элементов");
        numbers.stream().skip(5).forEach(e -> System.out.print(e + " "));


        //Limit - Оставить n элементов
        System.out.println("\nОставить первые n элементов");
        numbers.stream().limit(5).forEach(e -> System.out.print(e + " "));

        //Преобразующие операции
        //Map -Преобразование элемента
        System.out.println("\nПреобразование элементов");
        numbers.stream().map(e -> e + 1).forEach(e -> System.out.print(e + " "));

        List<Human> humans = List.of(new Human(20), new Human(30));
        //Peek -Действие над элементами
        System.out.println("\nИзменение элементов");
        humans.stream().peek(e -> e.setAge(40)).forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println(humans.get(0));
        List<Integer> integers = List.of(1, 2, 3);

        //FlatMap - устранение вложенности
        System.out.println();
        System.out.println("устранение вложенности");
        List<List<Integer>> listWithLists = List.of(List.of(1, 2, 3), List.of(5, 6), List.of(9));
        List<Integer> integerList = listWithLists.stream().flatMap(e -> e.stream()).toList();


        System.out.println(integerList.get(0));
        System.out.println(listWithLists.get(0));

        //sort - сортирующие операции
        System.out.println("Сортировка элементов");
        List<Integer> unsortedNumbers = List.of(5, 9, 2, 4, 4);
        List<Integer> sortedNumbers = unsortedNumbers.stream().sorted((a, b) -> b.compareTo(a)).toList();
        System.out.println(sortedNumbers);
    }
}
