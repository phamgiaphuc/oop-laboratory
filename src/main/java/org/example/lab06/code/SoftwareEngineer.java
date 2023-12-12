package org.example.lab06.code;

public class SoftwareEngineer extends Employee{
    public SoftwareEngineer() {}
    public SoftwareEngineer(String empName, int empId) {
        super(empName, empId);
    }
    @Override
    public boolean work() {
        System.out.println(this);
//        System.out.println("I am programming");
        return false;
    }
    @Override
    public String toString() {
        return "Software Engineer: " + super.toString();
    }

}
