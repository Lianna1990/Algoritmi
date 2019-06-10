package lesson2;

import java.util.Scanner;

/**
 * Задание № 2
 * Создать программу, которая переворачивает вводимые строки (читает справа налево).
 */
public class HomeWork2 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        String a = new String ();

        System.out.println ("Введите строку ");
        a = in.nextLine ();

        String b = new StringBuffer (a).reverse ().toString ();

        System.out.println ("Обратное слово для слова " + a + " = " + b);

    }


}
