package com.Assisment.DemoForAssisment.Services;

import java.util.List;
import com.Assisment.DemoForAssisment.Entity.Subject;

public interface SubjectService {
	List<Subject> getAllSubjects();

	Subject createStudent(Subject subject);
}
