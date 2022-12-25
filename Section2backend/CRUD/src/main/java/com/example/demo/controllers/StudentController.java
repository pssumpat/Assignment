package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/students")
public class StudentController 
{
	@Autowired
	StudentService service;
	
	@PostMapping("/addStudent")
	public ResponseEntity<Object> addStudent(@RequestBody Student stud)
	{
		Student resp = service.addStudent(stud);
		return new ResponseEntity<>(resp,HttpStatus.CREATED);
	}
	
	@GetMapping("/getStudent/{email}")
	public ResponseEntity<Object> getStudent(@PathVariable("email") String email)
	{
		Student resp = service.getStudent(email);
		return new ResponseEntity<>(resp,HttpStatus.CREATED);
	}
	
	@PutMapping("/updateStudent/{email}")
	public ResponseEntity<Object> updateStudent(@RequestBody Student stud,@PathVariable("email") String email)
	{
		Student resp = service.updateStudent(stud,email);
		
		
		return new ResponseEntity<>(resp,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteStudent/{email}")
	public ResponseEntity<Object> deleteStudent(@PathVariable("email") String email)
	{
		boolean resp = service.deleteStudent(email);
		return new ResponseEntity<>(resp,HttpStatus.CREATED);
	}
	

}
