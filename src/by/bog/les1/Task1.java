package by.bog.les1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Число с клавиатуры");
        int arr = sc.nextInt();
        if (arr % 2 == 0) {
            int[] array = new int[arr];
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(100);
            }
            System.out.println(Arrays.toString(array));
            // ага, интересно, получишь ты так нечетные?)
            // а если поменять местами if else, код будет работать правильно?
        } else {
            System.out.println("Запонить массив строк");
            String[] str = new String[arr];
            for (int i = 0; i < str.length; i++) {
                str[i] = sc.nextLine();
            }
            System.out.println(Arrays.toString(str));
        }

    }
}
