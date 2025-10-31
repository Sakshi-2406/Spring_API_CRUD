package com.ty.api.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.api.crud.model.Student;
import com.ty.api.crud.service.StudentService;

@RestController
@RequestMapping("/students")
public class studentController {
	
	@Autowired
	StudentService studentService;
	@PostMapping
	public String addStudent(@RequestBody Student student) {
		//System.out.println(student);
		//return student;
		 return studentService.addStudent(student);
	}
	@DeleteMapping("/id")
   public String removeStudent(@RequestParam int id) {
		 studentService.removeStudent(id);
		 return "data deleted";
	}
	@DeleteMapping
   public String removeAllStudent() {
		return studentService.removeAllStudent();
	}
	@GetMapping("/id/{a}")
   public Object fetchStudent(@PathVariable int a) {
		Object o=studentService.fetchStudent(a);
		return o;
	}
	@GetMapping
   public List<Student> fetchAllStudent() {
	List<Student> list= studentService.fetchAllStudent();
	return list;
	}
	@PutMapping
   public String editStudent(Student student) {
		return studentService.editStudent(student);
	}
}
