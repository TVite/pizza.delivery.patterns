package main;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    /**
     * The single instance of this class.
     */
    private static OrderManager orderManager;

    /**
     * List of drivers that are subscribed to the OrderManager.
     */
    private List<Driver> driverList = new ArrayList<>();

    private OrderManager() {
        // Constructor is private so that new instances can not be created, because this is a singleton.
    }

    /**
     * Get the instance of this class.
     * @return Instance of OrderManager
     */
    public static OrderManager getInstance() {
        if (orderManager == null) {
            orderManager = new OrderManager();
        }
        return orderManager;
    }

    /**
     * Subscribe a new Driver to new Orders.
     * @param driver Driver
     */
    public void addDriver(Driver driver) {
        driverList.add(driver);
    }

    /**
     * OrderManager notifies all Drivers whenever a new Order is received.
     * @param order Order
     */
    public void receiveOrder(Order order) {
        for(Driver driver: driverList) {
            driver.receiveNotification(order);
        }
    }
}
