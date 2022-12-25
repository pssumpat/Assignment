package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;
import com.example.demo.repo.StudentRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService 
{
	@Autowired
	StudentRepo repo;
	
	public Student addStudent(Student stud)
	{
		repo.save(stud);
		return stud;
	}
	
	public Student getStudent(String email)
	{
		Student stud = repo.findByemail(email);
		return stud;
	}
	
	public Student updateStudent(Student stud,String email)
	{
		Student resp =	repo.findByemail(email);
		resp.setRollnumber(stud.getRollnumber());
		resp.setName(stud.getName());
		resp.setAge(stud.getAge());
		resp.setClasss(stud.getClasss());
		resp.setSection(stud.getSection());
		resp.setAddress(stud.getAddress());
		resp.setMobile(stud.getMobile());
		resp.setEmail(stud.getEmail());
		repo.save(resp);
		return resp;
	}
	
	public boolean deleteStudent(String email)
	{
		Student stud1 = repo.findByemail(email);
		if(stud1 == null)
			return false;
		else
		{
			repo.deleteByemail(email);
			return true;
		}
		
		
	}
	

}
