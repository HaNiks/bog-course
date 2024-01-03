package by.bog.cicle;
/*  Задача 3
Есть целое число (num)
Пользователь вводит строку
Если длина строки, больше этого числа, то выводится сообщение формата «Длина “строка” больше “число”»
Если меньше, то вывести «Длина “строка” меньше“число”»
“строка“ и “число“ - значения */

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 20;
        String str = sc.next();

        if(str.length()>20) {
            System.out.printf("Длинна больше  %s > %d", str , sum);
        } else if (str.length()<20) {
            System.out.printf("Длинна меньше %s < %d", str , sum);
        }
    }
}
