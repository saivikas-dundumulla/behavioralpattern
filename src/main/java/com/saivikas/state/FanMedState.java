package com.saivikas.state;

public class FanMedState implements State{
    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("FAN : HIGH STATE");
        fan.setState(fan.getFanHighState());
    }
}
