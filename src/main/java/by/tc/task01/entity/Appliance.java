package by.tc.task01.entity;

public class Appliance {
    protected String name;
    protected double price;

    public Appliance() {
    }

    protected Appliance(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
