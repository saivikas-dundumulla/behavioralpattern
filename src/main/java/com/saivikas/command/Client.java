package com.saivikas.command;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command command = new ToggleCommand(light);

        Switch lightSwitch = new Switch();
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
    }
}
