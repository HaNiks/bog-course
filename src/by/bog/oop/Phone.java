package by.bog.oop;

public class Phone {
    private String number;
    private String model;

    private double weight;

    public Phone(String number, String model, double weight) {
        this.model = model;
        this.weight = weight;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
}
