package com.exam.simuduck.model;

import com.exam.simuduck.behavior.impl.FlyNoWay;
import com.exam.simuduck.behavior.impl.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("나는 가짜 오리");
    }
}
