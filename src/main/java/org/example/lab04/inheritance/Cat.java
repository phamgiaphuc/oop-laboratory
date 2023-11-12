package org.example.lab04.inheritance;/*
 * Cat.java
 *
 * A simple class representing a cat.
 */

public class Cat extends Animal {
    private boolean isShortHaired;

    // Cat's constructor
    public Cat(String name, boolean isShortHaired) {
        super(name, 4);
        this.isShortHaired = isShortHaired;
    }

    public boolean isShortHaired() {
        return this.isShortHaired;
    }
    
    public boolean isExtroverted() {
        return false;
    }

    public boolean isSleeping() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + (isShortHaired ? " short-haired" : " long-haired");
    }
}