package main.items.pizza;

public class ExtraCheese implements Pizza {

    private Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public double getPrice() {
        return this.pizza.getPrice() + 2;
    }

    public String getDescription() {
        return this.pizza.getDescription() + "+ExtraCheese";
    }
}
