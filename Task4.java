package ArraYs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* Создать пустой массив чисел. В цикле заполнять массив до тех пор, пока е закончиться место
 * либо пока не введем строку. после этого вывести массив */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int index = 0;

        while (index < array.length) {
            String input = sc.next();
            if(input.equals("end")) {
                break;
            }
            array[index] = Integer.parseInt(input);
            index++;
        }
        System.out.println(Arrays.toString(array));
    }
}

