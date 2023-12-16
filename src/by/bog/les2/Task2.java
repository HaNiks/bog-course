package by.bog.les2;
/* Есть массив целых чисел {1,2,1,6,2,3,-1}
Отсортировать массив двумя способами.
Первый – с помощью встроенной функции (поищи).
Второй – самостоятельно пузырьковой сортировкой.
Вывести полученный массив.*/

import java.util.Arrays;


public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 6, 2, 3, -1};
        System.out.println("не отсортированный: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                int left = array[j - 1];
                int right = array[j];
                if (left > right) {
                    int temp = left;
                    left = right;
                    right = temp;
                }
            }
        }
        System.out.println("отсорт BubleSort: " + Arrays.toString(array));
        System.out.println();
        Arrays.sort(array);
        System.out.print("отсорт методом: " + Arrays.toString(array));
    }

}
