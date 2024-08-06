package com.Assisment.DemoForAssisment.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Assisment.DemoForAssisment.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
 
}
