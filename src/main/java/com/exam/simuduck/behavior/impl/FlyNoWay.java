package com.exam.simuduck.behavior.impl;

import com.exam.simuduck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fry() {
        System.out.println("<<날지 못함>>");
    }
}
