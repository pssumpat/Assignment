package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	
	private String rollnumber;
	private String name;
	private int age;
	private int classs;
	private String section;
	private String address;
	private int mobile;
	@Id
	private String email;
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClasss() {
		return classs;
	}
	public void setClasss(int classs) {
		this.classs = classs;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", age=" + age + ", classs=" + classs
				+ ", section=" + section + ", address=" + address + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
	
	

}
