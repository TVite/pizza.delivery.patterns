package main;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    /**
     * List of drivers that are subscribed to the OrderManager.
     */
    private static List<Driver> driverList = new ArrayList<>();

    private OrderManager() {
        // Constructor is private so that new instances can not be created, because this is a singleton.
    }

    /**
     * Subscribe a new Driver to new Orders.
     * @param driver Driver
     */
    public static void addDriver(Driver driver) {
        driverList.add(driver);
    }

    /**
     * OrderManager notifies all Drivers whenever a new Order is received.
     * @param order Order
     */
    public static void receiveOrder(Order order) {
        for(Driver driver: OrderManager.driverList) {
            driver.receiveNotification(order);
        }
    }
}
