package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Student;

public interface StudentRepo extends JpaRepository<Student,String>{

	Student findByemail(String email);

	void deleteByemail(String email);

}
