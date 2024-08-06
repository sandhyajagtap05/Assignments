package com.Assisment.DemoForAssisment.Services;



import java.util.List;
import com.Assisment.DemoForAssisment.Entity.Student;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> getAllStudents();

}
