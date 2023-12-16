package by.bog.cycles;
/* Задача 1
Есть целое число (num)
Пользователь вводит еще одно целое число (x), если это число больше чем num, то выводить «x > num»
Если меньше, то выводить «x < num»
x и num - значения чисел
Выводить все через printf*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 14;
        int x = sc.nextInt();

        if (x > num) {
            System.out.printf("%d > %d", x, num);
        } else if (x < num) {
            System.out.printf("%d < %d", x, num);
        }
    }
}
