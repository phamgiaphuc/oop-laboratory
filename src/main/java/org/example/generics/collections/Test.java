package org.example.generics.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test<T>{
    private ArrayList<T> list;
    public Test (ArrayList<T> data) {
        this.list = data;
    }

    public void printList() {
        ListIterator<T> list_data = list.listIterator();
        System.out.println("Print left to right");
        while (list_data.hasNext()) {
            T element = list_data.next();
            System.out.println(element);
        }
        System.out.println("Print right to left");
        while (list_data.hasPrevious()) {
            T element = list_data.previous();
            System.out.println(element);
        }
    }

    public boolean containsElement(T element) {
        return list.contains(element);
    }
}
