package com.example.CRUD.dto;

public class StudentSaveDTO {

    private String studentName;
    private String addres;
    private String mobile;
    private boolean active;

    public StudentSaveDTO(String studentName, String addres, String mobile, boolean active) {
        this.studentName = studentName;
        this.addres = addres;
        this.mobile = mobile;
        this.active = active;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
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
}