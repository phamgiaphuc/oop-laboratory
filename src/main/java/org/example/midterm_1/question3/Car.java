package org.example.midterm.question3;

public class Car extends Vehicle{
    private final int size = 4;
    public Car(String brandName, int speed, String color) {
        super(brandName, speed, color, 1);
    }

    public int getSize() {
        return size;
    }

    @Override
    public void showType() {
        System.out.println("This is a car");
    }
}
