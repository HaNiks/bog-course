package by.bog.strings;

/* 1)Дано два числа, например 3 и 56, необходимо составить следующие строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используем метод StringBuilder.append().
2) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt(). */
public class demoStringBuilder1 {
    public static void main(String[] args) {
        int num1 =3;
        int num2 = 56;
        StringBuilder sb = new StringBuilder();
        sb.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2);
        System.out.println(sb.toString()); // Вывод: 3 + 56 = 59

        sb = new StringBuilder();
        sb.append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2);
        sb.deleteCharAt(sb.indexOf("=")).insert(sb.indexOf("="), "равно");
        System.out.println(sb); // Вывод: 3 - 56 равно -53

        sb = new StringBuilder();
        sb.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
        sb.replace(sb.indexOf("="), sb.indexOf("=") + 1, "равно");
        System.out.println(sb); // Вывод: 3 * 56 равно 168
    }
}

