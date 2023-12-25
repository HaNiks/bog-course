package by.bog.strings;
/* Дана строка. Выведите в консоль последний символ строки.*/

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String: ");
        String string = sc.nextLine();

        System.out.println( "Последний символ строки: " + string.charAt(string.length()-1));
    }
}
