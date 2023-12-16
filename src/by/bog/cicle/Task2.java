package by.bog.cicle;
import java.util.Scanner;

/* Задача 2
Есть дробное число (num)
Пользователь вводит целое число (x). Если это число четное, то число num умножается на x и выводится
Если нечетное, то складывается и тоже выводится
Вывод должен быть формата: «Result: результат» (результат - это полученное при операции число) */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 2.5;
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Result: " + num * x);
        } else {
            System.out.println("Result: " + num + x);
        }
    }
}
