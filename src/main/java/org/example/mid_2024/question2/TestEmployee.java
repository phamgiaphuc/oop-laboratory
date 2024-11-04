package org.example.mid_2024.question2;

public class TestEmployee {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Phuc", 18, 320.32);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Han", 20, 32.32, 87.3);
        fullTimeEmployee.displayDetails();
        partTimeEmployee.displayDetails();

    }
}
