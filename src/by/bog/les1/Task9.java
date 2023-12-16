package by.bog.les1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            int[] array = new int[number];
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(100);
            }
            System.out.println(Arrays.toString(array));
        } else {
            String[] str = new String[number];
            for (int i = 0; i < str.length; i++) {
                str[i] = sc.next();
            }
            System.out.println(Arrays.toString(str));
        }
    }
}


