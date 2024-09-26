package org.javaacademy.lesson9.ex1;

public class DateConvertorUtil {
    private static int COUNT_DAYS_IN_YEAR = 365;

    public static int convertAgeToDays(int age) {
        return age * COUNT_DAYS_IN_YEAR;
    }
}
