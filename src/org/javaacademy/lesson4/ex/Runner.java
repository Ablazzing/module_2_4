package org.javaacademy.lesson4.ex;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        String studentName = "Ivanov George";
        String studentName2 = "Petrova Masha";
        Integer score = 5;
        Integer score2 = 3;

        int groupIndex = studentName.hashCode() % 15;

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put(studentName, score);
        scores.put(studentName2, score2);
        scores.put("Ivanov George", 2);
        scores.put(null, 4);
        scores.put(null, 3);
        System.out.println(scores);

//        (0 % 15) + 1
//        [0, 1]

        System.out.println(
                Map.of("Ivanov George", 5,
                        "Petrova Masha", 3));

        System.out.println(scores.get("Ivanov George"));
    }
}
