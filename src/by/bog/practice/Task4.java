package by.bog.practice;
/* Дан массив вещественных чисел.
Найти среднее арифметическое всех положительных элементов и вывести результат.
Если он больше 10, то выводить (n > 10), если меньше или равен, то (n > 0 и n <= 10),
где n -  среднее арифметическое всех положительных элементов.
Если положительных элементов нет, вывести сообщение "Нет положительных элементов"*/
public class Task4 {
    public static void main(String[] args) {
        double n = 0.0;
        double sum = 0.0;
        double[] array = {1.1, 4.0, 1, -2.5};
        boolean a = true;
        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                System.out.println("Нет положительых элементов");

                return;
            }

            if (array[i] > 0) {
                sum = sum + array[i];
                n = sum / array.length;
            }

        }
        System.out.println("Сумма положитеых элементов: " + sum);
        System.out.println("Среднее арифмептическое: " + n);
        if (n > 0 && n <= 10) {
            System.out.printf("%f > 0 и %f <= 10", n, n);
        } else if (n > 10) {
            System.out.printf("%f>10", n);
        }

    }
}
