package ru.geekbrains.lesson8;

import java.util.*;

/**
 * Создать программу, реализующую метод цепочек
 */

public class HashMap {
    public static void main(String[] args) {
        Map<String, String> map = new java.util.HashMap<> ();
        map.put("apple", "banana");
        map.put ("apricot", "orange");

        String s = map.get ("apple");
        System.out.println (s);

        System.out.println (map.containsKey ("apple"));
        System.out.println (map.containsValue ("orange"));

        System.out.println (map.containsValue ("banana"));
        System.out.println (map.size ());

        System.out.println (map.remove ("apple"));
        System.out.println (map.containsKey ("apple"));

    }

}
