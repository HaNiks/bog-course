package by.bog.ArrayDemo;
/* /* Есть массив целых чисел {1,2,1,6,2,3,-1}
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
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("отсорт BubleSort: " + Arrays.toString(array));
        System.out.println();
        Arrays.sort(array);
        System.out.print("отсорт методом: " + Arrays.toString(array));
    }

}
