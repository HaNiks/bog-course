package by.bog.practice;
/* Пользователь вводит число n. Вывести все числа от 1 до n, которые делятся на 2 и не делятся на 3.*/

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0 && i % 3 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
