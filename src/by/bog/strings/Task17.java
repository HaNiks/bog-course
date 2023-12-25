package by.bog.strings;
/* Дано целое число. Выведите в консоль первую цифру этого числа.*/


import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        String number = sc.nextLine();
        Integer.parseInt(number);

        System.out.println(number.charAt(0));
    }
}

