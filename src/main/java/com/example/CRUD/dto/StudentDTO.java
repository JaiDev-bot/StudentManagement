package com.example.CRUD.dto;

import com.example.CRUD.entity.Student;

public class StudentDTO {

    private int studentId;
    private String studentName;
    private String address;
    private String mobile;
    private boolean active;



    public StudentDTO() {

    }


    public StudentDTO(Student entity) {
        studentId = entity.getStudentId();
        studentName = entity.getStudentName();
        address = entity.getAddres();
        mobile = entity.getMobile();
       active = entity.isActive();
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


