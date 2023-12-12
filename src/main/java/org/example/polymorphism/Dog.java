package org.example.polymorphism;

public class Dog extends Animal{
    private String type;
    public Dog (String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public void eat() {
        System.out.printf("Dog %s eats food\n", super.getName());
    }
}
