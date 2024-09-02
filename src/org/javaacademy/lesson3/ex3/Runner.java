package org.javaacademy.lesson3.ex3;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Runner {
    public static void main(String[] args) {
        //Реализация Deque + Queue
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Бабушка №1");
        linkedList.add("Бабушка №2");
        System.out.println("Очередь до наглеца");
        System.out.println(linkedList);
        System.out.println("Очередь до принятия пациента");
        linkedList.addFirst("Наглый человек");
        System.out.println(linkedList);
        System.out.println("Открывается кабинет");
        System.out.println("Заходит пациент:" + linkedList.pollLast());
        System.out.println("Очередь после захода пациента");
        System.out.println(linkedList);
        linkedList.addFirst(linkedList.pollLast());
        System.out.println(linkedList);

        System.out.println(linkedList.pop());

    }
}
