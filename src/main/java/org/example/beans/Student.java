package org.example.beans;

public class Student {

    private String StudentName;
    private int StudentId;

    private String StudentAddress;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        this.StudentId = studentId;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.StudentAddress = studentAddress;
    }


    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + StudentName + '\'' +
                ", StudentId=" + StudentId +
                ", StudentAddress='" + StudentAddress + '\'' +
                '}';
    }
}
