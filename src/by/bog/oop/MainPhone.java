package by.bog.oop;

public class MainPhone {
    public static void main(String[] args) {
        Phone phone = new Phone("+375333933698", "Samsung Galaxy S21", 0.35);
        Phone phone2 = new Phone("+375296010288", "iPhone 14Pro Max", 0.24);
        Phone phone3 = new Phone("+375296784199", "Nokia 3310", 1.25);

        System.out.println("Phone 1: " + phone.getNumber() + "\n" + "Model: " + phone.getModel() + "\n" + " Wright: " + phone.getWeight());
        System.out.println();
        System.out.println("Phone 2: " + phone2.getNumber() + "\n" + "Model: " + phone2.getModel() + "\n" + "Wright: " + phone2.getWeight());
        System.out.println();
        System.out.println("Phone 3: " + phone3.getNumber() + "\n" + "Model: " + phone3.getModel() + "\n" + "Wright: " + phone3.getWeight());
        System.out.println();

    }
}
