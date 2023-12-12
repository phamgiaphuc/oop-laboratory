package org.example.access_modifiers;

public class Student extends Person{
    public Student() {
        super();
    }
    public int getNumber() {
        return super.getNum();
    }
}
