package main;

import main.levels.BasicLevel;
import main.levels.CustomerLevel;

public class Customer {

    /**
     * Name of the Customer.
     */
    private String name;

    /**
     * Address of the Customer.
     */
    private String address;

    /**
     * The level of this Customer
     */
    private CustomerLevel level;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.level = new BasicLevel();
    }

    public Customer(String name, String address, CustomerLevel level) {
        this.name = name;
        this.address = address;
        this.level = level;
    }

    /**
     * Get the description of this Customer.
     * @return Description
     */
    public String getDescription() {
        return "Customer[Name:'" + this.name + "', Address:'" + this.address + "', Level:'" + getLevel().getDescription() + "']";
    }

    /**
     * Get the level of this Customer.
     * @return Level
     */
    public CustomerLevel getLevel() {
        return this.level;
    }
}
