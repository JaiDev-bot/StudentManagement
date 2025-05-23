package com.example.CRUD.service.IMPL;

import com.example.CRUD.dto.StudentSaveDTO;
import com.example.CRUD.entity.Student;
import com.example.CRUD.repository.StudentRepository;
import com.example.CRUD.service.StudentyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIMPL implements StudentyService {



    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {

        Student student = new Student(

                studentSaveDTO.getStudentName(),
                studentSaveDTO.getAddres(),
                studentSaveDTO.getMobile(),
                studentSaveDTO.isActive()

        );

        studentRepository.save(student);


        return student.getStudentName();
    }
}
