package org.example.lab03;
public class Main {
    public static void main(String[] args) {
        /*
          org.example.lab06.code.Employee 1
          First name: Van A    Last name: Nguyen
          Height: 6 feet 2 inches
          ID: 101
          Hourly pay: $35.5
          Salary: $5000
         */
        Employee employee1 = new Employee("Van A", "Nguyen", 6, 2, 101, 35.5, 5000);
        /*
          org.example.lab06.code.Employee 2
          First name: Van B    Last name: Nguyen
          Height: 5 feet 1 inches
          ID: 102
          Hourly pay: $28
          Salary: $4700
         */
        Employee employee2 = new Employee("Van B", "Nguyen", 5, 1, 102, 28, 4700);
        /*
          org.example.lab06.code.Employee 3
          First name: Van A    Last name: Nguyen
          Height: 6 feet 2 inches
          ID: 101
          Hourly pay: $35.5
          Salary: $5000
         */
        Employee employee3 = new Employee("Van A", "Nguyen", 6, 2, 101, 35.5, 5000);

        // Testing
        // org.example.lab06.code.Employee 1
        System.out.println(employee1);
        System.out.printf("After 1 week: $%.2f\n", employee1.payDay(50));
        employee1.getRaise();
        System.out.printf("Hourly pay: $%.2f\n", employee1.getHourlyPay());
        System.out.printf("After 1 week and get raise: $%.2f\n\n", employee1.payDay(50));

        // org.example.lab06.code.Employee 2
        System.out.println(employee2);

        // org.example.lab06.code.Employee 3
        System.out.println(employee3);

        // Compare employee 1 and employee 3
        System.out.println("Compare employee 1 and employee 3: " + employee1.equals(employee3));

        // Compare employee 1 and employee 2
        System.out.println("Compare employee 1 and employee 2: " + employee1.equals(employee2));
    }
}
