package by.bog.strings;
/* Задача B. Изменить регистр символа
Измените регистр символа, если он был латинской буквой: сделайте его заглавным,
если он был строчной буквой и наоборот. Для этого напишите отдельную функцию,
меняющую регистр символа.
Формат входных данных
Задан единственный символ C.
Формат выходных данных
10
Необходимо вывести получившийся символ.*/

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char: ");
        char s = sc.next().charAt(0);
        String str = Character.toString(s);
        if (str.matches("[a-z]")) {
            String s1 = str.toUpperCase();
            System.out.println(s1);
        } else if (str.matches("[A-Z]")) {
            String s2 = str.toLowerCase();
            System.out.println(s2);
        }
    }
}

