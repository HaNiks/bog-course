package by.bog.practice;

/*Дан массив чисел, найти первых 2 максимальных числа и вывести на экран.
 сделай через вызов функций (создай статические методы doFor, doWhile),
первый вызывай через for и проходя весь массив, а второй через while и с помощью метода двух указателей*/
public class Task7 {
    public static void main(String[] args) {

        int[] array = {5, 10, 11, 44, 11, 32, 25};

        doFor(array);
        doWhile(array);

    }

    private static void doFor(int[] array) {
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] > max2 && array[i] != max) {
                max2 = array[i];
            }
        }
        System.out.println("For: " + max + " " + max2);
    }

    private static void doWhile(int[] array) {

        int left = 0;
        int right = array.length - 1;
        int max1 = 0;
        int max2 = 0;

        while (left <= right) {
            if (array[left] > max1) {
                max2 = max1;
                max1 = array[left];
            }
            if (array[left] > max2 && array[left] != max1) {
                max2 = array[left];
            }
            left++;
            right--;
        }
        System.out.println("While: " + max1 + " " + max2);
    }
}
