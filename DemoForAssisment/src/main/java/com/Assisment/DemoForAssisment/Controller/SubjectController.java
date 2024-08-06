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
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public ResponseEntity<List<Subject>> getAllSubjects() {
        return ResponseEntity.ok(subjectService.getAllSubjects());
    }
    
    @PostMapping
    public Subject createStudent(@RequestBody Subject subject) {
        return subjectService.createStudent(subject);
    }
}
