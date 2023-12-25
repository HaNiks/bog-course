package by.bog.strings;
/* Дана строка. Выведите в консоль длину этой строки.*/

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String: ");

        String string = sc.nextLine();

        System.out.println( "long string: " + string.length());
    }
}
