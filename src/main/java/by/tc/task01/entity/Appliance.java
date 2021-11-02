package by.tc.task01.entity;

/**
 * The type of appliance.
 */
public class Appliance {
    protected String name;
    protected double price;

    /**
     * Public parameterless constructor.
     */
    public Appliance() {
    }

    /**
     * Public constructor.
     *
     * @param name value for name field
     * @param price value for price field
     */
    protected Appliance(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * @return name of appliance
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return price of appliance
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
