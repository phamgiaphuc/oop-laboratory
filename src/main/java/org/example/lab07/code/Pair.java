package org.example.lab07.code;

public class Pair <S, T> {
    private final S first;
    private final T second;
    public Pair (S first, T second) {
        this.first = first;
        this.second = second;
    }

    public S getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public String toString() {
        return "<" + first.toString() + ", " + second.toString() + ">";
    }

}
