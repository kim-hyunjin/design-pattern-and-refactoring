package com.exam.simuduck.model;

import com.exam.simuduck.behavior.impl.FlyNoWay;
import com.exam.simuduck.behavior.impl.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("나는 고무 오리");
    }
}
