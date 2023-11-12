package org.example.midterm.question2;

public class Teacher extends Person {
    private int numCourse;
    private int course;

    public Teacher(String name, String address) {
        super(name, address);
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public void work() {
        System.out.printf("Student %s at %s\n", super.getName(), super.getAddress());
    }
}
