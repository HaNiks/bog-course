package by.bog.strings;

import java.util.Arrays;
import java.util.Scanner;

/* 3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше)
средней, а также длину.*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк:");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку " + (i + 1) + ":");
            strings[i] = scanner.nextLine();
        }


        int totalLength = 0;
        for (String s : strings) {
            totalLength += s.length();
        }
        double averageLength = (double) totalLength / n;


        System.out.println("Строки длиной меньше средней:");
        for (String s : strings) {
            if (s.length() < averageLength) {
                System.out.println(s + " (длина: " + s.length() + ")");
            }
        }

        System.out.println("Строки длиной больше средней:");
        for (String s : strings) {
            if (s.length() > averageLength) {
                System.out.println(s + " (длина: " + s.length() + ")");
            }
        }

        System.out.println("Длина строки 'Java':");
        for (String s : strings) {
            if (s.toLowerCase().contains("java")) {
                System.out.println(s + " (длина: " + s.length() + ")");
            }
        }
    }
}