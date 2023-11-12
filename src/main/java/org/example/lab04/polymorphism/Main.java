package org.example.lab04.polymorphism;

public class Main {
    public static void main(String[] args) {
        ArrayBag b = new ArrayBag(10);
        b.add("hello");
        b.add("world");
        System.out.println(b.numItems());
        String s = (String) b.grab();
        System.out.println(s);
    }
}
