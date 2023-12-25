package by.bog.strings;
/* Задача A. Проверить, является ли символ цифрой
Определите, является ли данный символ цифрой или нет.
Формат входных данных
Задан единственный символ c.
Формат выходных данных
Необходимо вывести строку yes, если символ является цифрой, и строку no в противном
случае.*/

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str = sc.next().charAt(0);

         if(Character.isDigit(str)) {
             System.out.println("yes");
         }else {
             System.out.println("no");
         }
    }
}
