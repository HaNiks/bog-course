package by.bog.oop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Барсик", 3);
        dogs[1] = new Dog("Шарик", 5);
        dogs[2] = new Dog("Рекс", 2);

        System.out.println(Arrays.toString(dogs));

    }
}

