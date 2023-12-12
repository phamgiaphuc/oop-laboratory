package org.example.lab06.code;

public class SoftwareManager extends SoftwareEngineer implements Manager{
    public SoftwareManager() {}
    public SoftwareManager(String empName, int empId) {
        super(empName, empId);
    }
    @Override
    public boolean work() {
        System.out.println(this);
        return false;
    }

    @Override
    public void handleCrisis() {
        System.out.println("Handling a crisis by Software Manager with ID " + super.getId());
    }

    @Override
    public String toString() {
        return "Software Manager: " + super.toString();
    }
}
