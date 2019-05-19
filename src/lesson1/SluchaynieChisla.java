package lesson1;

/**
 * Задание  №№ Заполнить массив случайными числами
 */
public class SluchaynieChisla {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random () * 31) - 15);
            System.out.println (array[i]);
        }
    }
}

