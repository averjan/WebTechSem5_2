package by.tc.task01.entity;

import by.tc.task01.entity.characteristics.Color;

import java.util.Objects;

public class Kettle extends Appliance {
    private int powerConsumption;
    private double waterCapacity;
    private Color color;

    public Kettle() {
    }

    public Kettle(String name, double price, int powerConsumption, double waterCapacity, Color color) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.waterCapacity = waterCapacity;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kettle kettle = (Kettle) o;
        return name == kettle.name && price == kettle.price && powerConsumption == kettle.powerConsumption && Double.compare(kettle.waterCapacity, waterCapacity) == 0 && color == kettle.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, waterCapacity, color);
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", powerConsumption=" + powerConsumption +
                ", waterCapacity=" + waterCapacity +
                ", color=" + color +
                '}';
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWaterCapacity() {
        return waterCapacity;
    }

    public void setWaterCapacity(double waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
