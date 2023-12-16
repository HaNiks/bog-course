package by.bog.les1;

import java.util.Scanner;

public class InterV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        boolean includeRange = (sum > -15 && sum <= 12) || (sum > 14 && sum < 17) || (sum >= 19);
        System.out.println(includeRange);
    }
}



