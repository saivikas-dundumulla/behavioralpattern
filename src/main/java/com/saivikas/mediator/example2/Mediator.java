package com.saivikas.mediator.example2;

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupply powerSupply;

    public void setButton(Button button) {
        this.button = button;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }
    public void press(){
        if(fan.isOn()){
            fan.turnOff();
        }else fan.turnOn();
    }
    public void start(){
        powerSupply.start();
    }
    public void stop(){
        powerSupply.stop();
    }
}
