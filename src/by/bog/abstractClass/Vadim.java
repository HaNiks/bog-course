package by.bog.abstractClass;

public class Vadim extends Man {

    private String vadim;
    @Override
    public void move() {
        System.out.println("Бежит Вадим");
    }

    @Override
    public void say() {
        System.out.println("Говорит Вадим");
    }

    public void something() {
        System.out.println("Vadim");
    }
}
