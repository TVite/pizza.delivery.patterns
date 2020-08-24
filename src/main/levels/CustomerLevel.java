package main.levels;

import main.Order;

public interface CustomerLevel {

    /**
     * Send this Order to the OrderManager.
     */
    void send(Order order);

    /**
     * Receive a discount to the price.
     */
    double discount(double price);

    /**
     * Get the description of this level.
     */
    String getDescription();
}
