package main.levels;

import main.Order;
import main.OrderManager;

public class PremiumLevel implements CustomerLevel {

    /**
     * Send this Order to the OrderManager.
     */
    public void send(Order order) {
            OrderManager.receiveOrder(order);
    }

    /**
     * Receive a discount to the price.
     */
    public double discount(double price) {
        return price*0.9;
    }

    /**
     * Get the description of this level.
     */
    public String getDescription() {
        return "Premium";
    }

}
