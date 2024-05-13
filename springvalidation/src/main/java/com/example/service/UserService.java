package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserRepository;
import java.util.Optional;


@Service
public class UserService {
	@Autowired
	private UserRepository ar;

	public List<User> getUser() {

		return ar.findAll();
	}

	public User addUser(User a) {

		return ar.save(a);
	
	}
	public Optional<User> loginUser(User a) {
		return this.ar.findByUserEmailIdAndUserPassword(a.userEmailId, a.userPassword);
	}
}
