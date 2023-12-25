package by.bog.strings;

import java.util.Arrays;
import java.util.Scanner;

/* 1. Ввести n строк с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.*/
public class Task2 {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        int index = 0;
        int index2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        String[] string = new String[n];
        System.out.println("enter " + n + " string: ");
        for (int i = 0; i < string.length; i++) {
            string[i] = sc.next();
            if (string[i].length() <= str2.length()) {
                str2 = string[i];
                index2 = i;
            }
            if (string[i].length() > str1.length()) {
                str1 = string[i];
                index = i;

            }

        }
        System.out.println(Arrays.toString(string));
        System.out.println("Самая длинная: " + str1 + " index[" + index + "]");
        System.out.println("Самая короткая: " + str2 + " index[" + index2 + "]");
    }
}
