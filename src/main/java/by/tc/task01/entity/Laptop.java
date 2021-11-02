package by.tc.task01.entity;

import by.tc.task01.entity.characteristics.OS;

import java.util.Objects;

/**
 * The type of laptop
 */
public class Laptop extends Appliance{
    private int batteryCapacity;
    private int memoryRom;
    private int systemMemory;
    private float cpu;
    private int displayInches;
    private OS os;

    /**
     * Public parametless constructor.
     */
    public Laptop() {
    }

    /**
     * @param name name field
     * @param price price field
     * @param batteryCapacity batteryCapacity field
     * @param memoryRom memoryRom field
     * @param systemMemory systemMemory field
     * @param CPU CPU field
     * @param displayInches displayInches field
     * @param operatingSystem os field
     */
    public Laptop(String name, double price, int batteryCapacity, int memoryRom, int systemMemory, float CPU, int displayInches, OS operatingSystem) {
        super(name, price);
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = CPU;
        this.displayInches = displayInches;
        this.os = operatingSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return laptop.name.equals(name) && laptop.price == price && batteryCapacity == laptop.batteryCapacity && memoryRom == laptop.memoryRom && systemMemory == laptop.systemMemory && Float.compare(laptop.cpu, cpu) == 0 && displayInches == laptop.displayInches && os == laptop.os;
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, memoryRom, systemMemory, cpu, displayInches, os);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", batteryCapacity=" + batteryCapacity +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", CPU=" + cpu +
                ", displayInches=" + displayInches +
                ", operatingSystem=" + os +
                '}';
    }

    /**
     * @return batteryCapacity of laptop
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
     * @return memoryRom of laptop
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
     * @return systemMemory of laptop
     */
    public int getSystemMemory() {
        return systemMemory;
    }

    /**
     * @param systemMemory systemMemory to set
     */
    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    /**
     * @return CPU of laptop
     */
    public float getCpu() {
        return cpu;
    }

    /**
     * @param cpu CPU to set
     */
    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    /**
     * @return displayInches of laptop
     */
    public int getDisplayInches() {
        return displayInches;
    }

    /**
     * @param displayInches displayInches to set
     */
    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    /**
     * @return OS of laptop
     */
    public OS getOs() {
        return os;
    }

    /**
     * @param os OS to set
     */
    public void setOs(OS os) {
        this.os = os;
    }
}
