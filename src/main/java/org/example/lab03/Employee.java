package org.example.lab03;

public class Employee extends Person{
    private int id;
    private double hourlyPay;
    private double salary;
    public Employee(String firstName, String lastName, int height_feet, int height_inches, int id, double hourlyPay, double salary) {
        super(firstName, lastName, height_feet, height_inches);
        this.id = id;
        this.hourlyPay = hourlyPay;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    // This method gives a raise to the user, increasing their total hourly pay by 15%.
    public void getRaise() {
        this.hourlyPay *= 1.15;
    }

    // This method calculates how much the employee earned for the week.
    public double payDay(int total_time) {
        if (total_time > 40) {
            int over_time = total_time - 40;
            return (40 * hourlyPay) + (over_time * hourlyPay * 1.5);
        }
        return 40 * total_time;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "They make $" + String.format("%.2f", hourlyPay) + " per hour" +"\n" +
                "They have the employee ID " + id + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee toCompare) {
            return toCompare.id == this.id && toCompare.lastName.equals(this.lastName);
        }
        return false;
    }
}
