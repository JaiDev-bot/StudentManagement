package com.example.CRUD.dto;

import com.example.CRUD.entity.Student;
import lombok.*;



public class StudentDTO {

    private int studentId;
    private String studentName;
    private String address;
    private String mobile;
    private boolean active;


    public StudentDTO(int studentId, String studentName, String address, String mobile, boolean active) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.mobile = mobile;
        this.active = active;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
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
}


