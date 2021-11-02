package by.tc.task01.entity;

import by.tc.task01.entity.characteristics.Color;

import java.util.Objects;

/**
 * The type of tabletPC
 */
public class TabletPC extends Appliance{
    private int batteryCapacity;
    private double displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private Color color;

    /**
     * Public parameterless constructor
     */
    public TabletPC() {
    }

    /**
     * @param name name field
     * @param price price field
     * @param batteryCapacity batteryCapacity field
     * @param displayInches displayInches field
     * @param memoryRom memoryRom field
     * @param flashMemoryCapacity flashMemoryCapacity field
     * @param color color field
     */
    public TabletPC(String name, double price, int batteryCapacity,
                    double displayInches, int memoryRom, int flashMemoryCapacity, Color color) {
        super(name, price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return name.equals(tabletPC.name) && price == tabletPC.price && batteryCapacity == tabletPC.batteryCapacity && displayInches == tabletPC.displayInches && memoryRom == tabletPC.memoryRom && flashMemoryCapacity == tabletPC.flashMemoryCapacity && color == tabletPC.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color=" + color +
                '}';
    }

    /**
     * @return batteryCapacity of tabletPC
     */
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * @param batteryCapacity batteryCapacity to set
     */
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * @return displayInches of tabletPC
     */
    public double getDisplayInches() {
        return displayInches;
    }

    /**
     * @param displayInches displayInches to set
     */
    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    /**
     * @return memoryRom of tabletPC
     */
    public int getMemoryRom() {
        return memoryRom;
    }

    /**
     * @param memoryRom memoryRom to set
     */
    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    /**
     * @return flashMemoryCapacity of tabletPC
     */
    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    /**
     * @param flashMemoryCapacity flashMemoryCapacity to set
     */
    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    /**
     * @return color of tabletPC
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
