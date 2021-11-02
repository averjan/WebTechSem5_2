package by.tc.task01.entity;

import by.tc.task01.entity.characteristics.Color;

import java.util.Objects;

/**
 * The type of Kettle
 */
public class Kettle extends Appliance {
    private int powerConsumption;
    private double waterCapacity;
    private Color color;

    /**
     * Public parameterless constructor.
     */
    public Kettle() {
    }

    /**
     * @param name name field
     * @param price price field
     * @param powerConsumption powerConsumption field
     * @param waterCapacity waterCapacity field
     * @param color color field
     */
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
        return name.equals(kettle.name) && price == kettle.price && powerConsumption == kettle.powerConsumption && Double.compare(kettle.waterCapacity, waterCapacity) == 0 && color == kettle.color;
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

    /**
     * @return powerConsumption of kettle
     */
    public int getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * @param powerConsumption powerConsumption to set
     */
    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * @return waterCapacity of kettle
     */
    public double getWaterCapacity() {
        return waterCapacity;
    }

    /**
     * @param waterCapacity waterCapacity to set
     */
    public void setWaterCapacity(double waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    /**
     * @return color of kettle
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
