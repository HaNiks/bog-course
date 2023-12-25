package by.bog.practice;

import java.util.Scanner;

/* Напишите программу, которая принимает две строки от пользователя и проверяет равны ли они( с учетом регистра)*/
public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter one String");
        String str1 = sc.nextLine();
        System.out.println("enter two String");
        String str2 = sc.nextLine();

        if(str1.equals(str2)) {
            System.out.println("String equals");
        }else {
            System.out.println("String !equals");
        }
    }
}
