package com.example.CRUD.service;

import com.example.CRUD.dto.StudentDTO;
import com.example.CRUD.dto.StudentSaveDTO;
import com.example.CRUD.dto.StudentUpdateDTO;

import java.util.List;

public interface StudentService {


     String updateStudent(StudentUpdateDTO studentUpdateDTO);

    String addStudent(StudentSaveDTO studentSaveDTO);

     List<StudentDTO> getAllStudent();

    boolean deleteStudent(int id);

    StudentDTO getStudentById(int id);

    List<StudentDTO> findStudentName(String name);
}
