package by.bog.les1;

import java.util.Scanner;

public class Malev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: прямогуольник, треугольник, круг");
        String figur = sc.next();
        // с маленькой
        double square = 0.5;
        //switch-case
        if (figur.equals("прямоугольник")) {
            System.out.println("Введите длинну");
            double length = sc.nextDouble();
            System.out.println("Введите ширину");
            double width = sc.nextDouble();
            System.out.println("Площадь прямоугольника = " + width * length);

        } else if (figur.equals("треугольник")) {
            System.out.println("Введите основание ");
            double a = sc.nextDouble();
            System.out.println("Введите высоту ");
            double h = sc.nextDouble();
            System.out.println("Площадь треугольника = " + square * a * h);
        } else if (figur.equals("круг")) {
            System.out.println("Введите радиус");
            double r = sc.nextDouble();
            System.out.println("Площадь круга = " + Math.PI * (r * r));
        }
    }
}
