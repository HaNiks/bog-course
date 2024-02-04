package by.bog.les1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one: ");
        double sum1 = sc.nextInt();
        System.out.println("Enter number thow: ");
        double sum2 = sc.nextInt();
        System.out.println("enter operation +, -, *, /");
        String operation = sc.next();

        //switch-case
        switch (operation) {
            case "+" -> System.out.println(sum1 + sum2);
            case "-" -> System.out.println(sum1 - sum2);
            case "*" -> System.out.println(sum1 * sum2);
            case "/" -> System.out.println(sum1 / sum2);
        }
    }
}
