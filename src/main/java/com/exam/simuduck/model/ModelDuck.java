package com.exam.simuduck.model;

import com.exam.simuduck.behavior.impl.FlyNoWay;
import com.exam.simuduck.behavior.impl.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("나는 모형 오리");
    }
}
