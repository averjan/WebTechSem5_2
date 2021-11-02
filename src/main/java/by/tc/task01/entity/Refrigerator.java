package by.tc.task01.entity;

import java.util.Objects;

/**
 * The type of refrigerator
 */
public class Refrigerator extends Appliance{
    private int powerConsumption;
    private double weight;
    private int freezerCapacity;
    private int overallCapacity;
    private int height;
    private int width;

    /**
     * Public parameterless constructor.
     */
    public Refrigerator() {
    }

    /**
     * @param name name field
     * @param price price field
     * @param powerConsumption powerConsumption field
     * @param weight weight field
     * @param freezerCapacity freezerCapacity field
     * @param overallCapacity overallCapacity field
     * @param height height field
     * @param width width field
     */
    public Refrigerator(String name, double price, int powerConsumption,double weight,
                        int freezerCapacity, int overallCapacity, int height, int width) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return name.equals(that.name) && price == that.price
                && powerConsumption == that.powerConsumption
                && weight == that.weight
                && freezerCapacity == that.freezerCapacity
                && overallCapacity == that.overallCapacity
                && height == that.height && width == that.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity,
                overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    /**
     * @return powerConsumption of refrigerator
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
     * @return weight of refrigerator
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
     * @return freezerCapacity of refrigerator
     */
    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    /**
     * @param freezerCapacity freezerCapacity to set
     */
    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    /**
     * @return overallCapacity of refrigerator
     */
    public int getOverallCapacity() {
        return overallCapacity;
    }

    /**
     * @param overallCapacity overallCapacity to set
     */
    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    /**
     * @return height of refrigerator
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
     * @return width of refrigerator
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
