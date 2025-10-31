package com.ty.api.crud.dao;

import java.util.List;
import java.util.Optional;

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

	public Optional<Student> fetchStudent(int id) {
		Optional<Student> optional = studentRepository.findById(id);
		return optional;
	}

	public List<Student> fetchAllStudent() {
		List<Student> list = studentRepository.findAll();
		return list;
	}

	
}
