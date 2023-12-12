package org.example.access_modifiers;

public class Person {
    protected String name;
    private int num = 3;
    public Person(){

    }
    public void printName() {
        System.out.println(name);
    }
    public int getNum() {
        return num;
    }
}
