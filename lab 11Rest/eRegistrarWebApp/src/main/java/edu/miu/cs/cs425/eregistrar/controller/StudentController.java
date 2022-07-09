package edu.miu.cs.cs425.eregistrar.controller;

import edu.miu.cs.cs425.eregistrar.Service.StudentService;
import edu.miu.cs.cs425.eregistrar.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = {"/eregistrar/api/student"})
public class StudentController {
    @Autowired
    private StudentService studentService;

//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }

    @GetMapping(value = {"/list"})
    public List<Student> displayStudents(){
        return  studentService.findAll();

      // return (List<Student>) studentService.findAll();
    }

    @PostMapping(value = {"/register"})
    public void RegisterStudents(@Valid @RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping(value = {"/get/{studentId}"})
    public Student GetStudent(@PathVariable Integer studentId){
        return studentService.getStudentById(studentId);
    }

    @PutMapping(value = {"update/{studentId}"})
    public Student UpdateStudent(@Valid @RequestBody Student student,@PathVariable Integer studentId){
        return studentService.updateStudent(student,studentId);
    }

    @DeleteMapping(value = {"/delete/{studentId}"})
    public void deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudentById(studentId);
    }

}