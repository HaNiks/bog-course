package by.bog.strings;

import java.util.Scanner;

/* Дано слово. Получите его последнюю букву. Если слово заканчивается на мягкий знак, то получите предпоследнюю букву.*/
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
        String str1 = sc.nextLine();

        if (str1.charAt(str1.length()-1)  == 'ь') {
            char s2 = str1.charAt(str1.length()-2);
            System.out.println(s2);

        }else {
            char s1 = str1.charAt(str1.length()-1);
            System.out.println(s1);
        }
    }
}
