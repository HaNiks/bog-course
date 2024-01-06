package by.bog.oop;

import java.util.Arrays;
import java.util.Scanner;

import static by.bog.oop.Cat.printCat;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();

    }

    public static void Task1() {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Барсик", 3);
        dogs[1] = new Dog("Шарик", 5);
        dogs[2] = new Dog("Рекс", 2);

        System.out.println(Arrays.toString(dogs));
    }

    public static void Task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кличку");
        String name = sc.nextLine();
        System.out.println("Введитье возраст");
        int age = sc.nextInt();
        Dog myDog = new Dog(name, age);
        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
    }
    public static void Task3(){
        Cat myCat = new Cat("Мурзик",4, "Британская");
        printCat(myCat);
    }
}

