package org.example.midterm.question2;

public class MainTest {
    public static void main(String[] args) {
        Student student = new Student("Tài chó điên", "Nhà tù Hoà Hưng");
        Teacher teacher = new Teacher("Hưng thủ khoa", "Cầu rồng Đà Nẵng");
        student.work();
        teacher.work();
    }
}
