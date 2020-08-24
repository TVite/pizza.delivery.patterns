package main;

import java.util.List;
import main.items.Item;
import main.levels.CustomerLevel;

public class Order {

    /**
     * The Customer that made the Order.
     */
    private Customer owner;

    /**
     * Order is a composite (Structural) that consists of multiple Items.
     */
    private List<Item> items;

    /**
     * Should the Order be delivered quickly.
     */
    private boolean express;

    /**
     * The MemberType of this Order.
     */
    private CustomerLevel level;

    /**
     * Order is made using the OrderBuilder.
     * @param builder Order builder
     */
    public Order(OrderBuilder builder) {
        this.owner = builder.getOwner();
        this.items = builder.getItems();
        this.express = builder.getExpress();
        this.level = this.owner.getLevel();
    }

    /**
     * Get the total price of the Order.
     * The price is the sum of all the Items that it is composed of.
     * @return Total price
     */
    public double getPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        if (this.express) {
            totalPrice += 3;
        }
        return this.level.discount(totalPrice);
    }

    /**
     * Get the description of this Order.
     * @return Description
     */
    public String getDescription() {
        return "Order: {" +
                "Owner:" + this.owner.getDescription() + ", " +
                "Items:" + getItemsDescription() + ", " +
                "Express:" + this.express + ", " +
                "Price:" + getPrice() + "}";
    }

    /**
     * Helper method to get the description of all Items.
     * @return Items' description
     */
    private String getItemsDescription() {
        StringBuilder description = new StringBuilder("{");
        for (int i = 0; i < items.size(); i++) {
            description.append(items.get(i).getDescription());
            if (i+1 < items.size()) {
                description.append(", ");
            } else {
                description.append("}");
            }
        }
        return description.toString();
    }

    /**
     * Send this Order to the OrderManager.
     */
    public void send() {
        this.level.send(this);
    }
}
