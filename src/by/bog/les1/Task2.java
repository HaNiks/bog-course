package by.bog.les1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();

        for (int i = 0; i < st; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }
    }
}
