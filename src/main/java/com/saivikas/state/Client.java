package com.saivikas.state;

public class Client {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
    }
}
