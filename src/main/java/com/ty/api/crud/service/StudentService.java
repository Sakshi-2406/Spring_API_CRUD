package com.ty.api.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.api.crud.dao.Studentdao;
import com.ty.api.crud.model.Student;
import com.ty.api.crud.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	Studentdao studentdao;
	@Autowired
	StudentRepository studentRepository;

	public String addStudent(Student student) {
		return studentdao.addStudent(student);
	}

	public Object fetchStudent(int id) {
		Optional<Student> optional = studentdao.fetchStudent(id);
		if (optional.isPresent()) {
			return optional;
		} else {
			return "data not found";
		}
	}

	public List<Student> fetchAllStudent() {
		List<Student> list = studentdao.fetchAllStudent();
		if (list.isEmpty()) {
			return null;
		} else {
			return list;
		}
	}

	public String removeStudent(int id) {
		studentRepository.deleteById(id);
		return "data deleted";
	}
	
	 public String removeAllStudent() {
		 List<Student> list = studentdao.fetchAllStudent();
		 if(list.isEmpty()) {
			 return "no data deleted";
		 }
		 else {
			studentRepository.deleteAll();
			return "data deleted";
			
		}
}
	 public String editStudent(Student student) {
		 Optional<Student> optional = studentdao.fetchStudent(student.getId());
		 if(optional.isPresent()) {
			 studentRepository.save(student);
				return "data updated";
		 }
		 else {
			 return "updated";
		 }
			
		}
	 
}
