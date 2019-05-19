package lesson1;

public class HomeWork1 {
    /**
     * Задание №1
     */
    public static void main(String[] args) {

        System.out.println ("create array");
        int a[] = new int[1000];

        System.out.println ("initialize array");
        for (int i = 0; i < 1000; ++i) a[i] = i;

        System.out.println ("out array");
        for (int i = 0; i < 1000; ++i) System.out.println (a[i]);
    }


}


