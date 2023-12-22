package org.example.inclass.quiz_1;

import java.util.ArrayList;

public class GenDemo {
    public static void main(String[] args) {
        GenList<String> directions = new GenList<>(new ArrayList<>());
        GenList<Integer> grades = new GenList<>(new ArrayList<>());
        // Add elements to directions
        directions.addElement("East");
        directions.addElement("West");
        directions.addElement("South");
        directions.addElement("North");
        // Add elements to grades
        grades.addElement(3);
        grades.addElement(10);
        grades.addElement(5);
        // Print
        directions.printElement();
        grades.printElement();
    }
}
