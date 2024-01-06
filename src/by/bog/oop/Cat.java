package by.bog.oop;

public class Cat {
    String name;
    int age;
    String breed;

    public Cat (String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
    public static void printCat(Cat cat) {
        System.out.println("Кличка: " + cat.getName());
        System.out.println("Возраст: " + cat.getAge());
        System.out.println("Порода: " + cat.getBreed());
    }
}
