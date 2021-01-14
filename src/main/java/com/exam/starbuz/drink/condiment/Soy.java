package com.exam.starbuz.drink.condiment;

import com.exam.starbuz.drink.Beverage;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 500 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
