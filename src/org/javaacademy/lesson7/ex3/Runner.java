package org.javaacademy.lesson7.ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        List<String> names = List.of("Петр", "Иван", "Михаил", "Ян");
        //Stream.of("Петр", "Иван", "Михаил") - isOpen = true
        Stream<String> stream = names.stream();
        ArrayList<String> newNames = new ArrayList<>();
        //Stream.of("Петр", "Иван", "Михаил") - isOpen = false

        //Терминальные операции
        //forEach - Применение к каждому элементу стрима какого то действия
        stream.forEach(name -> newNames.add(name));

        //count - Количество элементов внутри стрима
        System.out.println("Количество элементов - " + names.stream().count());

        //anyMatch - Хотя бы один элемент соответствует условию
        boolean hasAnyPetr = names.stream().anyMatch(name -> name.equals("Юрий"));
        System.out.println("Есть хотя бы один Юрий? " + hasAnyPetr);

        //allMatch - Все элементы соответствуют условию
        boolean allPeopleAreMichail = names.stream().allMatch(e -> "Михаил".equals(e));
        System.out.println("Все ли элементы - Михаил?" + allPeopleAreMichail);

        boolean noneOleg = names.stream().noneMatch(e -> "Олег".equals(e));
        System.out.println("Нет ни одного Олега? " + noneOleg);

        boolean anyNameHasLetter = names.stream().anyMatch(e -> e.toLowerCase().contains("я"));
        System.out.println("Есть хотя бы один человек с буквой \"я\" в имени? " + anyNameHasLetter);

        //Хочу получить первый элемент из стрима
        Optional<String> firstElement = names.stream().findFirst();

        //Петр - 4
        //Михаил - 6
        //[null, null]
        //[Петр, null]
        //
        //Петр.length() - Михаил.length() = -2

        //[Ян, Петр]
        //Петр.length() - Ян.length()  = 2
        //Получение самого длинного имени
        Optional<String> longestName = names.stream().max((a, b) -> a.length() - b.length());
        System.out.println(longestName.orElse("Нет такого имени!"));

        //Получение самого короткого имени
        Optional<String> shortestName = names.stream().min((a, b) -> a.length() - b.length());
        System.out.println(shortestName.orElse("Нет такого имени!"));

        //Получение одного сгруппированного значения
        Optional<String> result = names.stream().reduce((a, b) -> "%s, %s".formatted(a, b));
        String result2 = names.stream().reduce("", (a, b) -> "%s, %s".formatted(a, b));
        System.out.println("Результат объединения строк: " + result.orElseThrow());
        System.out.println(result2);
        System.out.println("___________________________________________");
        List<Integer> numbers = List.of(10, 20, 30);
//        String resultNumbers = numbers.stream().map(e -> String.valueOf(e))
//                .reduce((a, b) -> "%s, %s".formatted(a, b))
//                .orElseThrow();
        //System.out.println(resultNumbers);

        String result3 = numbers.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(","));
        System.out.println(result3);

    }
}
