package lesson1;

public class selectionSort{
public static void main(String[] args) {


        int[] numbers = { 3, 6, 1, 7, 2, 8, 10, 4, 9, 5 };
        int n = numbers.length;

        selectionSort(numbers, 0, n - 1);

        for (int i = 0; i < n; i++)
        System.out.print(numbers[i] + " ");
        }

public static void selectionSort(int[] numbers, int low, int high) {
        for (int h = low; h <= high; h++)
        swap(numbers, h, getSmallest(numbers, h, high));
        }


public static int getSmallest(int[] numbers, int low, int high) {
        int small = low;
        for (int i = low + 1; i <= high; i++)
        if (numbers[i] < numbers[small])
        small = i;
        return small;
        }


public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        }

        }