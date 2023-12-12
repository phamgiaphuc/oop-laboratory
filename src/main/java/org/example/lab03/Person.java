package org.example.lab03;

public class Person {
    protected String firstName;
    protected String lastName;
    protected double height_feet;
    protected double height_inches;

    public Person() {
        // Do something
    }

    public Person(String firstName, String lastName, int height_feet, int height_inches) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height_feet = height_feet;
        this.height_inches = height_inches;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "They are " + height_feet + " feet " + height_inches + (height_inches > 1 ? " inches" : " inch");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
