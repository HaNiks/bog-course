package ArraYs;
/* Создать пустой массив строк.
В цикле заполнять массив до тех пор, пока не закончится место, либо до первого слова «end».
После этого вывести массив.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] array = new String[7];
        int index = 0;

        while (index < array.length) {
         String input = sc.next();
         if(input.equals("end")) {
             break;
         }
         array[index] = input;
         index++;
        }
        System.out.println(Arrays.toString(array));
    }
}




