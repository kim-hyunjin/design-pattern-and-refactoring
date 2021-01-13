package com.exam.simuduck;

import com.exam.simuduck.behavior.impl.FlyRocketPowered;
import com.exam.simuduck.model.Duck;
import com.exam.simuduck.model.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.fly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.fly();
    }
}
