package by.bog.strings;
/* Пользователь вводит слова.
Написать программу, которая меняет в слове буквы «а», «b», «m» на их числовое значение.
После этого вывести  слова объединив их с помощью stringJoiner*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one string: ");
        String string = sc.nextLine();


        char[] array = string.toCharArray();
            witchNumber('a');
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                stringBuilder.append((int) array[i]);
            } else if (array[i] == 'b') {
                stringBuilder.append((int) array[i]);
            } else if (array[i] == 'm') {
                stringBuilder.append((int) array[i]);
            } else {
                stringBuilder.append(array[i]);
            }
        }
        System.out.println(stringBuilder);
    }

    public static String witchNumber(char str) {
        if (str == 'a' || str == 'b' || str == 'm') {
            return String.valueOf(((int) str));
        }
        return String.valueOf(str);
    }

}
