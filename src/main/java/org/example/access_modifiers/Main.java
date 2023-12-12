package org.example.access_modifiers;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Mary";
        System.out.println(student.getNumber());
    }
}
