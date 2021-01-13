package com.exam.simuduck.behavior.impl;

import com.exam.simuduck.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fry() {
        System.out.println("로켓 추진!!");
    }
}
