package by.bog.practice;

/* Дан массив чисел, найти максимальное из этих чисел и вывести на экран
 решить эту задачу с использованием цикла while и двух переменных (одна идет сначала, а вторая с конца) */
public class Task6 {
    public static void main(String[] args) {

        int max = 0;
        int[] array = {2, 5, 60, 11, 40, 200};
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            if (array[left] >= array[right]) {
                max = Math.max(array[left], max);
            } else {
                max = Math.max(array[right], max);
            }
            left++;
            right--;
        }
        System.out.println(max);
    }
}


