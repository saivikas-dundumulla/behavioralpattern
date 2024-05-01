package com.saivikas.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<EmployeeMemento> history = new Stack<>();

    public void save(Employee employee) {
        history.push(employee.save());
    }

    public void restore(Employee employee) {
        employee.revert(history.pop());
    }
}
