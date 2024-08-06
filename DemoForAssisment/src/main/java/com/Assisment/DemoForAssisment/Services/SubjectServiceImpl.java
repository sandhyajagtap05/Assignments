package com.Assisment.DemoForAssisment.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assisment.DemoForAssisment.Entity.Subject;
import com.Assisment.DemoForAssisment.Repositories.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

	@Override
	public Subject createStudent(Subject subject) {
		
		return subjectRepository.save(subject);
	}
}
