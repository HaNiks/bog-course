package by.bog.les1;

import java.util.Scanner;

public class MinMAx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int max = Math.max(number, Math.max(number2, number3));
        int min = Math.min(number, Math.min(number2, number3));
        int middle = (number + number2 + number3) - (max - min);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Middle: " + middle);
    }
}
