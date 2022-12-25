package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.UserRepo;
import com.example.demo.model.User;

@Service
public class userService {
	
	@Autowired
	UserRepo repo;
	
	public User getUser(String uname)
	{
		User user = repo.getByuserName(uname);
		return user;
	}
}
