package com.example.CRUD.dto;

public class StudentUpdateDTO {

    private int studentId;
    private String studentName;
    private String address;
    private String mobile;
    private boolean active;


    public StudentUpdateDTO(int studentId, String studentName, String address, String mobile, boolean active) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.mobile = mobile;
        this.active = active;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public boolean isActive() {
        return active;
    }
}
