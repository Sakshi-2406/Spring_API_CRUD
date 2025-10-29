package com.ty.api.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.api.crud.dao.Studentdao;
import com.ty.api.crud.model.Student;

@Service
public class StudentService {
	@Autowired
Studentdao studentdao;
	public String addStudent(Student student) {
		return studentdao.addStudent(student);
	}
}
