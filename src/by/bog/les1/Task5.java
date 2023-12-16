package by.bog.les1;

import java.util.Scanner;

//зачем так много пустых строк?
public class Task5 {
    public static void main(String[] args) {
        int[] array = {4, 12, 6, 24, 8};
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            // Лучше всего объявлять переменные 1 раз, а потом их использовать, т к затраты на создание тоже идут


            String str = sc.nextLine();
            if (str.equals("end")) {
                break;
            }

            if (str.equals("for")) {

                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j] + " ");
                }
                System.out.println();
            }

            if (str.equals("while")) {

                while (i < array.length) {
                    System.out.print(array[i] + " ");
                    i++;

                }
            }

        }
    }

}
