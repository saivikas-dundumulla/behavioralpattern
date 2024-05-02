package com.saivikas.observer;

public class User extends Observer {
    public User(Subject subject) {
        super(subject);
    }

    @Override
    void update() {
        System.out.println("Message Received:" + receiveMessage());
    }

    public void addMessage(String message) {
        subject.setState(message);
    }

    public String receiveMessage() {
        return subject.getState();
    }
}
