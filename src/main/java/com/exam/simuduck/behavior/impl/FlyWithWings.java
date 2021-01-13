package com.exam.simuduck.behavior.impl;

import com.exam.simuduck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fry() {
        System.out.println("fly~~");
    }
}
