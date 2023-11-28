package org.example.lab05.question2;

import java.util.ArrayList;

public class Pay {
    public static void main(String[] args) {
        // Initialize and print out the objects
        Employee[] employeeList = new Employee[3];
        employeeList[0] = new FixedPaidEmployee("A", 1000);
        employeeList[1] = new HourlyEmployee("B", 21, 45);
        employeeList[2] = new Sales("C", 1200, 1000);
        System.out.println(employeeList[0]);
        System.out.println(employeeList[1]);
        System.out.println(employeeList[2]);
        // Modify the objects
        System.out.println("After modification");
        ((Sales) employeeList[2]).setIncome(1200);
        ((HourlyEmployee) employeeList[1]).setHour(50);
        System.out.println(employeeList[1]);
        System.out.println(employeeList[2]);
    }
}
