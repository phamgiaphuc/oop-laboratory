package org.example.midterm.question2;

public class Student extends Person {
    private int numCourse;
    private int grade;

    public Student(String name, String address) {
        super(name, address);
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void work() {
        System.out.printf("Student %s at %s\n", super.getName(), super.getAddress());
    }
}
