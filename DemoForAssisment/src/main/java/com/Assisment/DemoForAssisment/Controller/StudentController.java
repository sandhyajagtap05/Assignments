package com.Assisment.DemoForAssisment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Assisment.DemoForAssisment.Entity.Student;
import com.Assisment.DemoForAssisment.Entity.Subject;
import com.Assisment.DemoForAssisment.Services.StudentService;
import com.Assisment.DemoForAssisment.Services.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

}
