package org.example.lab05.question2;

public class HourlyEmployee extends Employee {
    private double rate; // Hourly rate
    private int hour;

    public HourlyEmployee(String name, double rate, int hour) {
        super(name);
        this.rate = rate;
        this.hour = hour;
    }

    public double getSalary() {
        return hour > 40 ? (rate * 40 + (hour - 40) * rate * 1.5) : (rate * 40);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return String.format("org.example.lab06.code.Employee %s earns %.1f$ per month", name, getSalary());
    }
}
