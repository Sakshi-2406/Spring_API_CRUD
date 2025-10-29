package com.ty.api.crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.api.crud.model.Student;
import com.ty.api.crud.repository.StudentRepository;

@Repository
public class Studentdao {
	@Autowired
StudentRepository studentRepository;
	
	public String addStudent(Student student) {
		studentRepository.save(student);
		return "Data inserted";
	}
}
