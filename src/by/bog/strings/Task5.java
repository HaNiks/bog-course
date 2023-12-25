package by.bog.strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/* . Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского
алфавита, а среди них – количество слов с равным числом гласных и согласных букв.*/
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество слов:");
        int n = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        String[] words = new String[n];

        // Ввод слов с консоли
        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово " + (i + 1) + ":");
            words[i] = scanner.nextLine().toLowerCase(); // приводим слово к нижнему регистру для удобства проверки
        }

        int latinWordsCount = 0;
        int javaWordsCount = 0;

        // Подсчет количества слов, содержащих только символы латинского алфавита
        for (String word : words) {
            if (word.matches("[a-z]+")) {
                latinWordsCount++;

                // Подсчет количества слов с равным числом гласных и согласных букв "java"
                int vowelsCount = 0;
                for (char c : word.toCharArray()) {
                    if ("aeiou".indexOf(c) != -1) {
                        vowelsCount++;
                    }
                }
                int consonantsCount = word.length() - vowelsCount;
                if (vowelsCount == consonantsCount && word.contains("java")) {
                    javaWordsCount++;
                }
            }
        }

        System.out.println("Количество слов, содержащих только символы латинского алфавита: " + latinWordsCount);
        System.out.println("Количество слов с равным числом гласных и согласных букв 'java': " + javaWordsCount);
    }
}