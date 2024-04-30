package com.saivikas.command;
//Invoker or Frontend button
public class Switch {
    public void storeAndExecute(Command command){
        command.execute();
    }
}
