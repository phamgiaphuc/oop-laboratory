package org.example.midterm.question3;

public class Motorbike extends Vehicle{
    private final int size = 2;
    public Motorbike(String brandName, int speed, String color) {
        super(brandName, speed, color, 2);
    }

    public int getSize() {
       return size;
    }

    @Override
    public void showType() {
        System.out.println("This is a motorbike");
    }
}
