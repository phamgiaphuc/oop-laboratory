package org.example.midterm.question3;

public class Bicycle extends Vehicle{
    private final int size = 1;
    public Bicycle(String brandName, int speed, String color) {
        super(brandName, speed, color, 3);
    }

    public int getSize() {
        return size;
    }

    @Override
    public void showType() {
        System.out.println("This is a bicycle");
    }
}
