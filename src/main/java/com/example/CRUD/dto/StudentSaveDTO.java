package com.example.CRUD.dto;

public class StudentSaveDTO {

    private String studentName;
    private String address;
    private String mobile;
    private boolean active;

    public StudentSaveDTO(String studentName, String address, String mobile, boolean active) {
        this.studentName = studentName;
        this.address = address;
        this.mobile = mobile;
        this.active = active;
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
