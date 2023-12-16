package by.bog.les2;

import java.util.Arrays;
import java.util.Scanner;


public class Task4 {
    // 1 регулярное выражение
    // 2 try-cath
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int index = 0;

        while (index < array.length) {
            String input = sc.next();
            array[index] = Integer.parseInt(input);
            index++;
        }
        System.out.println(Arrays.toString(array));
    }
}
