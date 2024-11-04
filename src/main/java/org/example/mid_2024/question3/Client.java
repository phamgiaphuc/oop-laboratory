package org.example.mid_2024.question3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String name;
    private final List<Service> services;

    public Client(String name) {
        this.name = name;
        this.services = new ArrayList<>();
    }

    public void bookService(Service service) {
        service.setServiceStatus(ServiceStatus.Booked);
        this.services.add(service);
    }

    public List<Service> getServices() {
        return this.services;
    }

    public void showServiceStatus() {
        System.out.println("Services for " + name + ":");
        for (Service service : services) {
            System.out.println(service);
        }
        System.out.println();
    }
}
