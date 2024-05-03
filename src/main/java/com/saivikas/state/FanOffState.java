package com.saivikas.state;

public class FanOffState implements State{
    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("Fan :LOW STATE");
        fan.setState(fan.getFanLowState());
    }
}
