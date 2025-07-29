package com.example.CRUD.controllers;

import com.example.CRUD.dto.StudentDTO;
import com.example.CRUD.dto.StudentSaveDTO;
import com.example.CRUD.dto.StudentUpdateDTO;
import com.example.CRUD.service.StudentyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {

    private static Logger logger = LoggerFactory.getLogger(StudentController.class.getName());


    @Autowired
    private StudentyService studentService;

    @PostMapping
    public ResponseEntity<?> addStudent (@RequestBody StudentSaveDTO studentSaveDTO) {

        try {
            studentService.addStudent(studentSaveDTO);
            return ResponseEntity.created(null).body("Estudante adicionado com sucesso!");
        }
        catch (Exception e) {
            logger.error(" Não foi possivel adicionar estudante.", e);
            return ResponseEntity.internalServerError().body("Não foi possivel adicionar estudante");
        }
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
