package by.bog.cicle;
import java.util.Arrays;
/*Задание
Реализуйте метод isPalindrome(), который определяет, является ли слово палиндромом или нет. Палиндром это слово, которое читается одинаково в обоих направлениях.

App.isPalindrome("шалаш"); // true
App.isPalindrome("ага"); // true
App.isPalindrome("хекслет"); // false

// Слова в метод могут быть переданы в любом регистре
App.isPalindrome("Ага"); // true
Для определения палиндрома, необходимо перевернуть строку и сравнить ее с исходной. Для этого воспользуйтесь методом StringUtils.reverse()

 */
public class Task5 {
    public static void main(String[] args) {
        boolean polindrom = true;
        String str = "ага";

        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i-1)) {
                polindrom = false;
                break;
            }
        }
        if (polindrom) {

            System.out.println("являеться: Polindrom ");
        } else {
            System.out.println("Не являеться: Polindrom");

        }
    }
}
