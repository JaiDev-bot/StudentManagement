package com.example.CRUD.controllers;

import com.example.CRUD.dto.StudentSaveDTO;
import com.example.CRUD.service.StudentyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentyService studentService;

    public  String saveEstudent(@RequestBody StudentSaveDTO studentSaveDTO){



        String name = studentService.addStudent(studentSaveDTO);
        return name;
    }

}
