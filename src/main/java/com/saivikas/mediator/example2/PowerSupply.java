package com.saivikas.mediator.example2;

public class PowerSupply {
    private final Mediator mediator;

    public PowerSupply(Mediator mediator) {
        this.mediator = mediator;
    }
    public void start(){
        System.out.println("Power Supply ON");
    }
    public void stop(){
        System.out.println("Power Supply OFF");
    }
}
