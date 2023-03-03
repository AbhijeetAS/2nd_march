package org.example.autowiring;

import java.util.List;

public class student {
    private String StudentName;
    private int id;

    private List<String> Subject;

    private List<Integer> Marks;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getSubject() {
        return Subject;
    }

    public void setSubject(List<String> subject) {
        Subject = subject;
    }

    public List<Integer> getMarks() {
        return Marks;
    }

    public void setMarks(List<Integer> marks) {
        Marks = marks;
    }


    @Override
    public String toString() {
        return "student{" +
                "StudentName='" + StudentName + '\'' +
                ", id=" + id +
                ", Subject=" + Subject +
                ", Marks=" + Marks +
                '}';
    }
}
