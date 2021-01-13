package com.exam.simuduck.behavior.impl;

import com.exam.simuduck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<조용>>");
    }
}
