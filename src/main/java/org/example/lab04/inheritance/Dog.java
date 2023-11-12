package org.example.lab04.inheritance;/*
 * Dog.java
 *
 * A simple class representing a dog.
 */

public class Dog extends Animal {
    private boolean isSmall;
    
    public Dog(String name, boolean isSmall) {
        super(name, 4);
        this.isSmall = isSmall;
    }

    public boolean isSmall() {
        return this.isSmall;
    }
    
    public String bark() {
        if (this.isSmall) {
            return "yip";
        } else {
            return "woof";
        }
    }
}
