package org.javaacademy.homework.homework4.ex2;

import java.util.stream.Stream;

public class Runner {
    private static final String LETTER_TO_FIND = "о";
    
    public static void main(String[] args) {
        //Задание №2 - Сколько здесь "о" ?
        //1. Создать набор уникальных слов: "тон", "тополь", "боль", "рой", "стройка"
        //2. Создать стрим у набора
        //2.1 Посчитать количество букв "о" в одном слове
        //2.2 Посчитать сумму количества букв "о" во всех словах из набора
        //2.3 Вывести на экран сумму букв "о". Если в словах нет буквы "о", то распечатать ноль.
        //
        //ожидаемый результат:
        //6
        
        Stream.of("тон", "тополь", "боль", "рой", "стройка")
                .distinct()
                .map(String::toLowerCase)
                .map(word -> countLetterInWord(word, LETTER_TO_FIND))
                .reduce(Long::sum)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println(0)
                );

        long countLetters = Stream.of("тон", "тополь", "боль", "рой", "стройка")
                .flatMap(word -> Stream.of(word.split("")))
                .filter(wordLetter -> wordLetter.equals(LETTER_TO_FIND))
                .count();
        System.out.println(countLetters);
    }

    private static long countLetterInWord(String word, String letter) {
        return Stream.of(word.split(""))
                .filter(wordLetter -> wordLetter.equals(letter))
                .count();
    }
}
