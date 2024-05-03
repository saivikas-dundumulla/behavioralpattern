package com.saivikas.state;

public class FanLowState implements State{
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("Fan :MEDIUM STATE");
        fan.setState(fan.getFanMedState());
    }
}
