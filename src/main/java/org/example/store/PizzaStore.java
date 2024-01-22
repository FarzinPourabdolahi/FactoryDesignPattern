package org.example.store;

import org.example.factory.SimplePizzaFactory;
import org.example.product.pizza.Pizza;

public class PizzaStore implements Store {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    @Override
    public Pizza order(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
