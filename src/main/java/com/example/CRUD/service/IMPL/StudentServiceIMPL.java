package com.example.CRUD.service.IMPL;

import com.example.CRUD.dto.StudentDTO;
import com.example.CRUD.dto.StudentSaveDTO;
import com.example.CRUD.dto.StudentUpdateDTO;
import com.example.CRUD.entity.Student;
import com.example.CRUD.repository.StudentRepository;
import com.example.CRUD.service.StudentyService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<StudentDTO> getAllStudent() {


        List<Student> getStudent = studentRepository.findAll();
        List<StudentDTO> studentDTOList = new ArrayList<>();

        for (Student student : getStudent) {
        StudentDTO studentDTO = new StudentDTO(

                student.getStudentId(),
                student.getStudentName(),
                student.getAddres(),
                student.getMobile(),
                student.isActive()

        );

        studentDTOList.add(studentDTO);
        }
//
        return studentDTOList;
    }




    @Override
    public String updateStudent(StudentUpdateDTO studentUpdateDTO) {

        if(studentRepository.existsById(studentUpdateDTO.getStudentId())){

            Student student = studentRepository.getById(studentUpdateDTO.getStudentId());

            student.setStudentName(studentUpdateDTO.getStudentName());
            student.setAddres(studentUpdateDTO.getAddress());
            student.setMobile(studentUpdateDTO.getMobile());
            student.setActive(studentUpdateDTO.isActive());

            studentRepository.save(student);


        }

        else {
            System.out.println(" Student id not exist");
        }

        return null;
    }

    @Override
    public boolean deleteStudent(int id) {
        if (studentRepository.existsById(id)){
            studentRepository.deleteById(id);
        }else{

            System.out.println("Student ID is not found");
        }

        return false;
    }

    @Override
    public StudentDTO getStudentById(int id){
        Optional<Student>student = studentRepository.findById(id);
        if (student.isPresent()){
            StudentDTO studentDTO = new StudentDTO(


                    student.get().getStudentId(),
                    student.get().getStudentName(),
                    student.get().getAddres(),
                    student.get().getMobile(),
                    student.get().isActive()
            );

            return studentDTO;

        }
        else {
            System.out.println("Student ID is not found");
        }
        return null;
    }

    @Override
    public List<StudentDTO> findStudentName(String name) {
        return List.of();
    }


}
