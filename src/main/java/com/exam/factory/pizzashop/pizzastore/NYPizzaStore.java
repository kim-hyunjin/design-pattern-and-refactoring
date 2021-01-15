package com.exam.factory.pizzashop.pizzastore;

import com.exam.factory.pizzashop.pizza.NYStyleCheesePizza;
import com.exam.factory.pizzashop.pizza.NYStyleVeggiePizza;
import com.exam.factory.pizzashop.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese": return new NYStyleCheesePizza();
            case "veggie": return new NYStyleVeggiePizza();
            default: return null;
        }
    }
}
