package by.bog.strings;
//Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в
//      позиции 0

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        String str = "HelloHorld";

        swapIndex(str);
    }
    private  static void swapIndex(String strs) {
        char three = strs.charAt(3);

        char zero = strs.charAt(0);

        char[] array = strs.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == three) {
                array[i] = zero;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
