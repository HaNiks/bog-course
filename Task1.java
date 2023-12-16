package ArraYs;
/* Задача 1
Создать пустой массив целых чисел.
В цикле while заполнить этот массив с клавиатуры.
Вывести значения в обратном порядке с помощью цикла for.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        while (i < array.length) {
            array[i] = sc.nextInt();
            i++;
        }
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }

    }
}
