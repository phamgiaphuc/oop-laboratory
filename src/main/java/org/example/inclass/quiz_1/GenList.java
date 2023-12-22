package org.example.inclass.quiz_1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GenList<T> {
    private List<T> list;
    public GenList(ArrayList<T> list) {
        this.list = list;
    }

    public void addElement(T element) {
        list.add(element);
    }

    public void printElement() {
        ListIterator<T> list_data = list.listIterator();
        while (list_data.hasNext()) {
            T element = list_data.next();
            System.out.println(element);
        }
    }
}
