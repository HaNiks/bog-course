package by.bog.practice;

/*Дан массив чисел, найти первых 2 максимальных числа и вывести на экран.
 сделай через вызов функций (создай статические методы doFor, doWhile),
первый вызывай через for и проходя весь массив, а второй через while и с помощью метода двух указателей*/
public class Task7 {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 11, 8, 10, 6, 3};

        doFor(numbers);
        updateMaxValues(1, 3, 4);
        doWhile(numbers);

    }


    public static void doFor(int[] arr) {
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] >= max2) {
                max2 = arr[i];
            }
        }

        System.out.println(" максимальное число: For " + max1 + " " + max2);
    }


    public static void doWhile(int[] arr) {
        int max1 = 0;
        int max2 = 0;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
            i++;
        }

        System.out.println(" максимальное число: While " + max1 + " " + max2);

    }

    public static int updateMaxValues(int currentValue, int max1, int max2) {
        if (currentValue > max1) {
            max2 = max1;
            max1 = currentValue;
        } else if (currentValue > max2) {
            max2 = currentValue;
        }
        return max2;
    }
}