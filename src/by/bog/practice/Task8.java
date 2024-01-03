package by.bog.practice;
/* Напишите Программу которая принимает строку от пользователя и выводит ее длинну*/

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String str = sc.nextLine();

        System.out.println("длина слова " + str + " состалвяет " + str.length());
    }
}
