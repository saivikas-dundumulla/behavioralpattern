package com.saivikas.memento;

public class EmployeeMemento {
    private final String name;
    private final String address;

    public EmployeeMemento(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
