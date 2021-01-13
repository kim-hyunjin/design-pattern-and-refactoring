package com.exam.simuduck.model;

import com.exam.simuduck.behavior.impl.FlyWithWings;
import com.exam.simuduck.behavior.impl.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("나는 빨간오리");
    }
}
