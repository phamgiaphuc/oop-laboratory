package org.example.lab05.question2;

public class FixedPaidEmployee extends Employee {
    private float salary;
    public FixedPaidEmployee(String name, float salary) {
        super(name);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("org.example.lab06.code.Employee %s earns %.1f$ per month", name, salary);
    }
}
