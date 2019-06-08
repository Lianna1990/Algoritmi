package lesson1;

import java.util.ArrayList;

public class AddArray {
    public static void main(String[] args) {
        ArrayList<String> list;
        list = new ArrayList<> ();
        list.add ("Мандарин");
        System.out.println ("Первый элемент массива '"
                + list.get (0) + "'");
        System.out.println ("Размер массива '"
                + Integer.valueOf (list.size ()) + "'");

        list.add ("Яблоко");
        list.add ("Груша");
        list.add ("Слива");

        list.set (1, "Персик");

        System.out.println (
                "2-ой элемент массива '" + list.get (1) + "'");




    }

}
