package com.UD_Inheritance_Example;

public class Student extends Person {

    private String studentId;

    public Student(String firstName, String lastName, String studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString(){
        return super.toString() + ", studentID: " + this.studentId;
    }
}
