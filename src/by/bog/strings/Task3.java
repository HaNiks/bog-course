package by.bog.strings;
/* 2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания)
.*/

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if(str[j].length()>str[j+1].length()) {
                    String temp = str[j];
                    str[j]=str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(str) + " Long string: ");
    }

}
