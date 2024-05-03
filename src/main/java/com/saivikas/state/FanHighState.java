package com.saivikas.state;

public class FanHighState implements State{
    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("FAN: OFF STATE");
        fan.setState(fan.getFanOffState());
    }
}
