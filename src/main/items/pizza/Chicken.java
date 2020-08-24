package main.items.pizza;

public class Chicken implements Pizza {

    private Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    public double getPrice() {
        return this.pizza.getPrice() + 2;
    }

    public String getDescription() {
        return this.pizza.getDescription() + "+Chicken";
    }
}
