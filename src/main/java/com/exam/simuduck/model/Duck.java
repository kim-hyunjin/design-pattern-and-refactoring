package com.exam.simuduck.model;

import com.exam.simuduck.behavior.FlyBehavior;
import com.exam.simuduck.behavior.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {

    }

    public void fly() {
        flyBehavior.fry();
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
