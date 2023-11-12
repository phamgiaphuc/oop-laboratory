package org.example.lab04.inheritance;

public class Main {
    public static void main(String[] args) {
        Abyssinian a = new Abyssinian("Abby");
        System.out.println(a.getNumLegs());
        System.out.println(a.isisExtroverted());
        System.out.println(a.isSleeping(12, 30));
//        System.out.println(a.isSmall());
        System.out.println(a); // a.toString()
        System.out.println(a.equals(a));
    }
}
