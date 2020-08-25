package main.levels;

import main.Order;
import main.OrderManager;

public class BasicLevel implements CustomerLevel {

    /**
     * Send this Order to the OrderManager.
     */
    public void send(Order order) {
        try {
            Thread.sleep(5 * 1000);
            OrderManager.getInstance().receiveOrder(order);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

    /**
     * Receive a discount to the price.
     */
    public double discount(double price) {
        return price;
    }

    /**
     * Get the description of this level.
     */
    public String getDescription() {
        return "Basic";
    }

}
