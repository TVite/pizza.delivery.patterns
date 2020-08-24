package main.items.pizza;

public class Pepperoni implements Pizza {

    private Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    public double getPrice() {
        return this.pizza.getPrice() + 1;
    }

    public String getDescription() {
        return this.pizza.getDescription() + "+Pepperoni";
    }
}
