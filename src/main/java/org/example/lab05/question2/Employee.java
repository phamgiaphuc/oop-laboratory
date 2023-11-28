package org.example.lab05.question2;

public class Employee {
    protected String name;
    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee " + name;
    }
}
