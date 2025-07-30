package com.example.CRUD.dto;

public class StudentSaveDTO {

    private String studentName;
    private String address;
    private String mobile;
    private boolean active;



    public StudentSaveDTO(){

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return getAddress();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public StudentSaveDTO(String studentName, String address, String mobile, boolean active) {
        this.studentName = studentName;
        this.address = address;
        this.mobile = mobile;
        this.active = active;


    }
}