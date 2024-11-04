package org.example.mid_2024.question2;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void displayDetails() {
        System.out.printf("This is a full time employee, name: %s, id: %d, and monthly salary: %.2f\n", super.getName(), super.getId(), monthlySalary);
    }
}
