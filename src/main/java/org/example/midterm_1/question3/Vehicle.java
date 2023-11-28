package org.example.midterm.question3;

public class Vehicle {
    private final String brandName;
    private int speed;
    private String color;
    private int[][] position;
    private int num;

    public Vehicle(String brandName, int speed, String color, int num) {
        this.brandName = brandName;
        this.color = color;
        this.speed = checkSpeed(speed);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBrandName() {
        return brandName;
    }

    private int checkSpeed(int speed) {
        if (speed == 1 || speed == 2 || speed == 4) {
            return speed;
        } else {
            throw new Error("Speed must be 1, 2 or 4");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = checkSpeed(speed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int[][] getPosition() {
        return position;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }

    public void showType() {
        System.out.println("This is a vehicle");
    }
}
