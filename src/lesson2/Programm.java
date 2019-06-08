package lesson2;

import java.util.ArrayDeque;

public class Programm {
    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<String> ();
        // стандартное добавление элементов
        states.add ("Russian");
        states.addFirst ("France"); // добавляем элемент в самое начало
        states.push ("Great Britain"); // добавляем элемент в самое начало
        states.addLast ("Spain"); // добавляем элемент в конец коллекции
        states.add ("Armenia");

        // получаем первый элемент без удаления
        String sFirst = states.getFirst ();
        System.out.println (sFirst);     // Great Britain
        // получаем последний элемент без удаления
        String sLast = states.getLast ();
        System.out.println (sLast);      // Armenia
    }
}
