package com.exam.proxy.remote.impl;


import com.exam.proxy.remote.GumballMachine;
import com.exam.proxy.remote.State;

public class SoldOutState implements State {
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진입니다! 동전을 넣으실 수 없습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("매진입니다! 반환할 동전이 없습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진입니다!");
    }

    @Override
    public void dispense() {
        System.out.println("매진입니다!");
    }

    @Override
    public String toString() {
        return "매진";
    }
}
