package org.example.polymorphism;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("A", 1, "Bulldog");
        dog1.eat();
        Animal animal2 = new Dog("B", 3, "Dog");
    }
}
