package by.bog.strings;

public class DemoTask1 {
    public static void main(String[] args) {
        String str = "Я изучаю Java ";

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append("and English ++");
        System.out.println(stringBuilder);

    }
}
