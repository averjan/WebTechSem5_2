package by.tc.task01.entity;

import java.util.Objects;

/**
 * The type of oven.
 */
public class Oven extends Appliance{
    private int powerConsumption;
    private double weight;
    private int capacity;
    private int depth;
    private int height;
    private int width;

    /**
     * Public parameterless constructor
     */
    public Oven() {
    }

    /**
     * @param name name field
     * @param price price field
     * @param powerConsumption powerConsumption field
     * @param weight weight field
     * @param capacity capacity field
     * @param depth depth field
     * @param height height field
     * @param width width field
     */
    public Oven(String name, double price, int powerConsumption, double weight,
                int capacity, int depth, int height, int width) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return name.equals(oven.name) && price == oven.price
                && powerConsumption == oven.powerConsumption
                && weight == oven.weight && capacity == oven.capacity
                && depth == oven.depth && height == oven.height
                && width == oven.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    /**
     * @return powerConsumption of oven
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
     * @return weight of oven
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return capacity of oven
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return depth of oven
     */
    public int getDepth() {
        return depth;
    }

    /**
     * @param depth depth to set
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * @return height of oven
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return width of oven
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }
}
