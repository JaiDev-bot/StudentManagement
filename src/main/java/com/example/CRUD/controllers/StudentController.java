package com.example.CRUD.controllers;

import com.example.CRUD.dto.StudentDTO;
import com.example.CRUD.dto.StudentSaveDTO;
import com.example.CRUD.dto.StudentUpdateDTO;
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

    @PostMapping(path = "/save")
    public  String saveEstudent(@RequestBody StudentSaveDTO studentSaveDTO){

        String name = studentService.addStudent(studentSaveDTO);
        return "added";
}
    @GetMapping(path = "/getallStudent")
    public List<StudentDTO> getAllStudent() {

        List<StudentDTO> allStudent = studentService.getAllStudent();
        return allStudent;

    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody StudentUpdateDTO studentUpdateDTO){

        String id = studentService.updateStudent(studentUpdateDTO);
        return "updated";

    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(value ="id") int id){

    boolean deleteStudent = studentService.deleteStudent(id);
    return "Student Deleted";
    }


}
