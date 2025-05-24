package com.example.CRUD.controllers;

import com.example.CRUD.dto.StudentDTO;
import com.example.CRUD.dto.StudentSaveDTO;
import com.example.CRUD.service.StudentyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentyService studentService;

    @RequestMapping(path = "/save")
    public  String saveEstudent(@RequestBody StudentSaveDTO studentSaveDTO){

        String name = studentService.addStudent(studentSaveDTO);
        return name;
    }


}
