package main;

public class Driver {

    /**
     * Name of the Driver.
     */
    private String name;

    /**
     * Vehicle of the Driver.
     */
    private String vehicle;

    public Driver(String name, String vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    /**
     * Get the description of this Driver.
     * @return Description
     */
    public String getDescription() {
        return "Driver[Name:'" + this.name + "', Vehicle:'" + this.vehicle + "']";
    }

    /**
     * Have the Driver receive a notification about an Order.
     * @param order Order
     */
    public void receiveNotification(Order order) {
        System.out.println(this.getDescription() + " has received a notification about " + order.getDescription());
    }
}
