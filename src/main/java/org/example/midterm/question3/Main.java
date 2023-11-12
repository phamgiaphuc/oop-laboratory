package org.example.midterm.question3;

public class Main {
    public static void main(String[] args) {
        Road road = new Road();
        Car car1 = new Car("A", 4, "red");
        Motorbike motorbike = new Motorbike("B", 2, "black");
        Bicycle bicycle = new Bicycle("C", 1, "blue");
        Car car2 = new Car("D", 4, "green");
        road.addVehicle(car1);
        road.addVehicle(motorbike);
        road.addVehicle(bicycle);
        road.addVehicle(car2);
        road.showRoad();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Move %d: ", i + 1);
            road.movement();
            road.showRoad();
        }
    }
}
