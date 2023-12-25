package by.bog.strings;
/* Дано число. Проверьте, четное оно или нет.*/

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int number = sc.nextByte();

        if(number % 2 == 0) {
            System.out.println("число четное");
        }else {
            System.out.println("Число не четное");
        }

    }
}
