package com.example.CRUD.repository;


import com.example.CRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

List<Student> findAllbyStudentnameEquals(String name);


}
