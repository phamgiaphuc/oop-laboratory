package org.example.generics.collections;

public class Player {
    private String name;
    private int age;
    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
