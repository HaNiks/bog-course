package cycles;
/* Задача 4
Есть строка (str)
Пользователь вводит строку (inputStr)
Если строки совпадают, то вывести сообщение «строки идентичны»
Иначе вывести: «строки различны, строки: “str“ и “inputStr“»*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Никита Лучший";
        String string = sc.nextLine();
        if (str.equals(string)) {
            System.out.println("Строки идентичны:");
        } else
            System.out.printf("строки различны, строки %s: %s: ", str, string);
    }
}


