package com.example.CRUD.service;

import com.example.CRUD.dto.StudentDTO;
import com.example.CRUD.dto.StudentSaveDTO;

import java.util.List;

public interface StudentyService {



    String addStudent(StudentSaveDTO studentSaveDTO);

     List<StudentDTO> getAllStudent();
     }
