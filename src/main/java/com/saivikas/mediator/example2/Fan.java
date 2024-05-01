package com.saivikas.mediator.example2;

public class Fan {
    private final Mediator mediator;
    private boolean isOn = false;

    public Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff(){
        mediator.stop();
        isOn = false;
        System.out.println("Fan OFF");
    }
    public void turnOn(){
        mediator.start();
        isOn = true;
        System.out.println("Fan ON");
    }
}
