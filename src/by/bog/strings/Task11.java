package by.bog.strings;
/* Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.*/

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int number = sc.nextInt();

        if(number < 0){
            System.out.println("Отрицательное: " + number );
        }else {
            System.out.println("Положительное: " + number);
        }
    }
}
