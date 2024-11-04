package org.example.mid_2024.question3;

public class Service {
    private String name;
    private double pricePerKm;
    private int distance;
    private ServiceStatus serviceStatus;
    private ServiceType serviceType;

    public Service(ServiceType serviceType, int distance) {
        this.distance = distance;
        this.serviceType = ServiceType.ExpressDelivery;
        if (serviceType == ServiceType.ExpressDelivery) {
            this.name = "Express Delivery";
            this.pricePerKm = 2.0;
        }
        if (serviceType == ServiceType.FoodDelivery) {
            this.name = "Food Delivery";
            this.pricePerKm = 1.0;
        }
        if (serviceType == ServiceType.InDayDelivery) {
            this.name = "In Day Delivery";
            this.pricePerKm = 0.5;
        }
    }

    public double getCost() {
        return this.pricePerKm * this.distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String toString() {
        return this.name + " (" + this.distance + "km, " + this.serviceType + ", Status: " + this.serviceStatus + ")";
    }
}
