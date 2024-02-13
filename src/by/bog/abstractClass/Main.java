package by.bog.abstractClass;

public class Main {
    public static void main(String[] args) {
        Max max = new Max();
        Vadim vadim = new Vadim();
        vadim.something();
        max.move();
        max.say();
        getFive(max);
        getFive(vadim);
    }

    public static void getFive(Man man) {
        System.out.println("Дает 5");
    }
}
