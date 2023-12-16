package by.bog.funkcii;
/* Создаем массив целых чисел.
По одному  вводим число в консоль.
Если число больше 10, то его пропускаем и выводим сообщение в консоль по шаблону «Число n не записано, т.к. оно больше 10».
Вводим числа пока не заполнится весь массив. По завершению вывести полученный массив.*/

import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int index = 0;
        while (index < array.length) {
            int n = sc.nextInt();

            if (n > 10) {
                System.out.println("Число " + n + " не записано, так как оно больше 10");
            } else {
                array[index] = n;
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
