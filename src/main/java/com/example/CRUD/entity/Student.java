package com.example.CRUD.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_id", length = 45)
    private int studentId;

    @Column(name = "Student_name", length = 80)
    private String studentName;

    @Column(name="addres", length = 100)
    private String addres;

    @Column(name="mobile", length = 12)
    private String mobile;


    @Column(name = "active")
    private boolean active;

    public Student(int studentId, String studentName, String address, String mobile, boolean active) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.addres = address;
        this.mobile = mobile;
        this.active = active;
    }

    public Student( String studentName, String address, String mobile, boolean active) {

        this.studentName = studentName;
        this.addres = address;
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
