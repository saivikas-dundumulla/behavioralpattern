package com.saivikas.observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
    private final List<Observer> observers = new ArrayList<>();

    abstract void setState(String state);

    abstract String getState();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
