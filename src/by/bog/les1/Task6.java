package by.bog.les1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result =0;
        double number = sc.nextDouble();

        if(number>20) {
            result = number*number;
        }   else if (number>10) {
            result = number*2;
        } else if (number>=5) {
            result = number/2;
        }
        System.out.println(result);
    }
}


