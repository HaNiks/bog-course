package by.bog.strings;
/* 1) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
* 2) Распечатать последний символ строки. Используем метод String.charAt().
* 3) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
* 4) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
* 5) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
* 6) Найти позицию подстроки “Java” в строке “I like Java!!!”.
* 7) Заменить все символы “а” на “о”.
* 8) Преобразуйте строку к верхнему регистру.
* 9) Преобразуйте строку к нижнему регистру.
* 10) Вырезать строку Java c помощью метода String.substring().*/

public class Task7 {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        printString(s);

        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.endsWith("!!!a") + " конец сравнение");
        System.out.println(s.startsWith("I like") + " начало сравнение");
        System.out.println(s.contains("Java") + " содердит ли подстраку");
        System.out.println(s.indexOf("a")+ " нахождение позиции слова ");
        System.out.println(s.replaceAll("a","o"));
        System.out.println(s.toUpperCase()+ " верхний регистр");
        System.out.println(s.toLowerCase()+ " нижний регистр");
        System.out.println(s.substring(7,11) + " вырезание из строки");

    }
    public static void printString(String str) {
        System.out.println(str);

    }
}
