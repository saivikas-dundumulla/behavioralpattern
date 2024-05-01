package com.saivikas.mediator.example2;

public class Button {
    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    private final Mediator mediator;
    public void press(){
        mediator.press();
    }
}
