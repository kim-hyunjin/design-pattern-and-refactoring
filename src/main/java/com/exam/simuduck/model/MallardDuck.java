package com.exam.simuduck.model;

import com.exam.simuduck.behavior.impl.FlyWithWings;
import com.exam.simuduck.behavior.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("나는 물오리!");
    }
}
