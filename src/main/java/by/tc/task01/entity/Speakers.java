package by.tc.task01.entity;

import java.util.Objects;

/**
 * The type of speakers
 */
public class Speakers extends Appliance{
	private int powerConsumption;
	private int numberOfSpeakers;
	private int frequencyRange;
	private int cordLength;

    /**
     * Public parameterless constructor
     */
	public Speakers() {
    }

    /**
     * @param name name field
     * @param price price field
     * @param powerConsumption powerConsumption field
     * @param numberOfSpeakers numberOfSpeakers field
     * @param frequencyRange frequencyRange field
     * @param cordLength cordLength field
     */
    public Speakers(String name, double price, int powerConsumption,
                    int numberOfSpeakers, int frequencyRange,
                    int cordLength) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return name.equals(speakers.name) && price == speakers.price
                && powerConsumption == speakers.powerConsumption
                && numberOfSpeakers == speakers.numberOfSpeakers
                && frequencyRange == speakers.frequencyRange
                && cordLength == speakers.cordLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength +
                '}';
    }

    /**
     * @return powerConsumption of speakers
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
     * @return numberOfSpeakers of speakers
     */
    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * @param numberOfSpeakers numberOfSpeakers to set
     */
    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    /**
     * @return frequencyRange of speakers
     */
    public int getFrequencyRange() {
        return frequencyRange;
    }

    /**
     * @param frequencyRange frequencyRange to set
     */
    public void setFrequencyRange(int frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    /**
     * @return cordLength of speakers
     */
    public int getCordLength() {
        return cordLength;
    }

    /**
     * @param cordLength cordLength to set
     */
    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }
}
