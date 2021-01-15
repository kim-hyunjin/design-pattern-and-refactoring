package com.exam.factory.pizzashop;

import com.exam.factory.pizzashop.pizza.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese": pizza = new CheesePizza();break;
            case "veggie": pizza = new VeggiePizza();break;
            case "clam": pizza = new ClamPizza();break;
            case "pepperoni": pizza = new PepperoniPizza();break;
        }

        return pizza;
    }
}
