package by.tc.task01.entity;

import java.util.Objects;

/**
 * The typ of vacuum cleaner
 */
public class VacuumCleaner extends Appliance{
    private int powerConsumption;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    /**
     * Public parameterless constructor
     */
    public VacuumCleaner() {
    }

    /**
     * @param name name field
     * @param price price field
     * @param powerConsumption powerConsumption field
     * @param motorSpeedRegulation motorSpeedRegulation field
     * @param cleaningWidth cleaningWidth field
     */
    public VacuumCleaner(String name, double price, int powerConsumption,
                         int motorSpeedRegulation, int cleaningWidth) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return name.equals(that.name) && price == that.price
                && powerConsumption == that.powerConsumption
                && motorSpeedRegulation == that.motorSpeedRegulation
                && cleaningWidth == that.cleaningWidth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", powerConsumption=" + powerConsumption +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }

    /**
     * @return powerConsumption of vacuum cleaner
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
     * @return motorSpeedRegulation of vacuum cleaner
     */
    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    /**
     * @param motorSpeedRegulation motorSpeedRegulation to set
     */
    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    /**
     * @return cleaningWidth of vacuum cleaner
     */
    public int getCleaningWidth() {
        return cleaningWidth;
    }

    /**
     * @param cleaningWidth cleaningWidth to set
     */
    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}
