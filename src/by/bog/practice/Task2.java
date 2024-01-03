package by.bog.practice;
/* Дана строковый массив со словами.
Найти самое длинное слово в массиве и вывести его.*/
public class Task2 {
    public static void main(String[] args) {
        String[] str = new String[]{"pensil", "adddpple", "mouse"};
        String s = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > s.length()) {
                s = str[i];
            }
        }
        System.out.println(s);
    }
}
