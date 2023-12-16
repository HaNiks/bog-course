package by.bog.practice;
/* Дан массив чисел. Найти сумму всех элементов, которые делятся на 2 и не делятся на 3.*/

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = {24, 23, 12, 11, 10, 4, 2};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 != 0) {
                sum = sum+ array[i];
            }

        }
        System.out.println();
        System.out.println(sum);
    }
}
