package com.ty.api.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
   public void removeStudent() {
		
	}
	@DeleteMapping
   public void removeAllStudent() {
		
	}
	@GetMapping("/id")
   public void fetchStudent() {
		
	}
	@GetMapping
   public void fetchAllStudent() {
		
	}
	@PutMapping
   public void editStudent() {
		
	}
}
