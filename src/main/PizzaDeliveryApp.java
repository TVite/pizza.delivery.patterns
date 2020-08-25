package main;

import main.items.Drink;
import main.items.Fries;
import main.items.Salad;
import main.items.pizza.Chicken;
import main.items.pizza.ExtraCheese;
import main.items.pizza.Mushrooms;
import main.items.pizza.Pepperoni;
import main.items.pizza.Pizza;
import main.items.pizza.PizzaBase;
import main.levels.PremiumLevel;

/*
 * CREATIONAL DESIGN PATTERNS
 * Singleton - OrderManager
 * Builder - OrderBuilder
 *
 * BEHAVIORAL DESIGN PATTERNS
 * Observer - Driver & OrderManager
 * State - CustomerLevel & Order
 *
 * STRUCTURAL DESIGN PATTERNS
 * Composite - Order
 * Decorator - Pizza
 */
public class PizzaDeliveryApp {

    public static void main(String[] args) {
        // OrderManager is a Singleton (Creational). Only one instance of it can exist.
        OrderManager manager = OrderManager.getInstance();
        manager.addDriver( new Driver("John", "Car") );
        manager.addDriver( new Driver("Anna", "Van") );

        // OrderBuilder is a Builder (Creational). Avoids constructor pollution.
        // Order is a Composite (Structural). It is made up of multiple Items.
        new OrderBuilder( new Customer("Tom", "Riga", new PremiumLevel()) )
                .addItem( createPizza() )
                .addItem( new Fries() )
                .addItem( new Drink() )
                .setExpress()
                .build()
                .send();
        // OrderManager acts as an Observable (Behavioral) that notifies all Drivers about newly sent Orders.

        // Another example
        manager.addDriver( new Driver("Peter", "Bicycle") );
        // Jane does not have a Premium level - State (Behavioral). Therefore her Order will implement the send() method differently.
        new OrderBuilder( new Customer("Jane", "Ventspils"))
                .addItem( new Mushrooms(new Pepperoni(new PizzaBase())) )
                .addItem( new Salad() )
                .build()
                .send();
    }

    /**
     * Helper method to create a customized pizza.
     * @return Pizza
     */
    private static Pizza createPizza() {
        // Pizza is created using a Decorator approach (Structure)
        return new ExtraCheese(new Mushrooms(new Chicken(new PizzaBase())));
    }
}
