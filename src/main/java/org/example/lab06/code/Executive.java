package org.example.lab06.code;

public class Executive extends Employee implements Manager{
    public Executive() {}
    public Executive(String empName, int empId) {
        super(empName, empId);
    }
    @Override
    public boolean work() {
        System.out.println(this);
        return true;
    }

    @Override
    public void handleCrisis() {
        System.out.println("Handling a crisis by Executive with ID " + super.getId());
    }

    @Override
    public String toString() {
        return "Executive: " + super.toString();
    }
}
