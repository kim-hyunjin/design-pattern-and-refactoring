package com.exam.factory.pizzashop.pizzastore;

import com.exam.factory.pizzashop.pizza.ChicagoStyleCheesePizza;
import com.exam.factory.pizzashop.pizza.ChicagoStyleVeggiePizza;
import com.exam.factory.pizzashop.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese": return new ChicagoStyleCheesePizza();
            case "veggie": return new ChicagoStyleVeggiePizza();
            default: return null;
        }
    }
}
