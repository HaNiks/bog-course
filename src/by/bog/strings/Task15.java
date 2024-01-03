package by.bog.strings;
/*Даны два слова. Проверьте, что первые буквы этих слов совпадают. */

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str1 = sc.nextLine();
        System.out.println("enter string");
        String str2 = sc.nextLine();

       char s1 = str1.charAt(0);
       char s2 = str2.charAt(0);

       if(s1 == s2) {
           System.out.println("Совпадают");
       }else {
           System.out.println("Не совпадают");
       }
    }
}
