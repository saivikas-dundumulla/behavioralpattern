package com.saivikas.memento;

public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee("John Doe", "123 Main St", 1234567890L);
        System.out.println("Employee before save: " + employee.getName() + " " + employee.getAddress());

        caretaker.save(employee);
        employee.setName("Jane Doe");
        employee.setAddress("456 Main St");
        System.out.println("Employee after save: " + employee.getName() + " " + employee.getAddress());
        caretaker.save(employee);

        employee.setName("John Doe");
        caretaker.restore(employee);
        System.out.println("Employee after restore: " + employee.getName() + " " + employee.getAddress());
    }
}
