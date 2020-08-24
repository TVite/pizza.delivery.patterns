package main;

import main.items.Item;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {

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
     * Start building a new Order
     * @param owner Customer
     */
    public OrderBuilder(Customer owner) {
        this.owner = owner;
    }

    /**
     * Add a new Item to the Order.
     * @param item Item
     * @return OrderBuilder
     */
    public OrderBuilder addItem(Item item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
        return this;
    }

    /**
     * Set the Order as Express.
     * @return OrderBuilder
     */
    public OrderBuilder setExpress() {
        this.express = true;
        return this;
    }

    /**
     * Get the finished Order.
     * @return Order.
     */
    public Order build() {
        return new Order(this);
    }

    /**
     * Get owner.
     * @return Owner
     */
    public Customer getOwner() {
        return owner;
    }

    /**
     * Get items.
     * @return Items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Get express.
     * @return Express
     */
    public boolean getExpress() {
        return express;
    }
}
