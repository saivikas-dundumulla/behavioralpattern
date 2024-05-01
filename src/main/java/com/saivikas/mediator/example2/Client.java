package com.saivikas.mediator.example2;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Button button = new Button(mediator);
        Fan fan = new Fan(mediator);
        PowerSupply supply = new PowerSupply(mediator);

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupply(supply);

        button.press();
        button.press();
        button.press();
    }
}
