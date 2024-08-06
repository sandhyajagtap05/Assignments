package com.Assisment.DemoForAssisment.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Student {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private String name;
    private String address;
    
    public Student() {
    	
    }

    public Student(Long id, String name, String address, Set<Subject> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.subjects = subjects;
	}

   
	@ManyToMany
    @JoinTable(
        name = "student_subject",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
	//@JsonManagedReference
//	@JsonIgnore
    private Set<Subject> subjects = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", subjects=" + subjects + "]";
	}

    // Getters and Setters
}
