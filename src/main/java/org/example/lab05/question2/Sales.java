package org.example.lab05.question2;

public class Sales extends Employee{
    private double salary;
    private double income;
    public Sales(String name, double salary, double income) {
        super(name);
        this.salary = salary;
        this.income = income;
    }

    public double getSalary() {
        return salary + income * 0.2;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return String.format("org.example.lab06.code.Employee %s earns %.1f$ per month", name, getSalary());
    }
}
