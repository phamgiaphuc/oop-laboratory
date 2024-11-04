package org.example.mid_2024.question3;

public class Driver {
    private String name;
    private double balance;
    private Service currentService;

    public Driver(String name) {
        this.name = name;
        this.balance = 0;
    }

    public void acceptService(Service service) {
        if (currentService == null && service.getServiceStatus() == ServiceStatus.Booked) {
            currentService = service;
            service.setServiceStatus(ServiceStatus.Delivering);
            System.out.println(name + " accepted the service: " + service);
        }
    }

    public void finishService() {
        if (currentService != null && currentService.getServiceStatus() == ServiceStatus.Delivering) {
            double earnings = 0.8 * currentService.getCost();
            balance += earnings;
            currentService.setServiceStatus(ServiceStatus.Delivered);
            System.out.printf("%s finished the service and earned $%.2f\n", this.name, earnings);
            currentService = null;
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Driver name: %s, balance: $%.2f", name, balance);
    }
}
