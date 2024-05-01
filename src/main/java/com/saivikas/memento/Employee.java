package com.saivikas.memento;

public class Employee {
    private String name;
    private String address;
    private Long phone;

    public Employee(String name, String address, Long phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(name, address);
    }

    public void revert(EmployeeMemento memento) {
        this.name = memento.getName();
        this.address = memento.getAddress();
    }
}
