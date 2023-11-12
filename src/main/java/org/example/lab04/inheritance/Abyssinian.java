package org.example.lab04.inheritance;

public class Abyssinian extends Cat {
    public Abyssinian(String name) {
        super(name,true);
    }

    public boolean isisExtroverted() {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
