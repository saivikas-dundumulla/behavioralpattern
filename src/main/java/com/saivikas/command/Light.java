package com.saivikas.command;
//Receiver / Backend Logic
public class Light {
    private boolean isOn = false;
    public void toggle(){
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }
    public void on(){
        System.out.println("Light Switched: ON");
    }
    public void off(){
        System.out.println("Light Switched: OFF");
    }
}
