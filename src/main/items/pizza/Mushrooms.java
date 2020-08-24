package main.items.pizza;

public class Mushrooms implements Pizza {

    private Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    public double getPrice() {
        return this.pizza.getPrice() + 1;
    }

    public String getDescription() {
        return this.pizza.getDescription() + "+Mushrooms";
    }
}
