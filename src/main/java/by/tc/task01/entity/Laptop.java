package by.tc.task01.entity;

import by.tc.task01.entity.characteristics.OS;

import java.util.Objects;

public class Laptop extends Appliance{
    private int batteryCapacity;
    private int memoryRom;
    private int systemMemory;
    private float cpu;
    private int displayInches;
    private OS os;

    public Laptop() {
    }

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

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }
}
