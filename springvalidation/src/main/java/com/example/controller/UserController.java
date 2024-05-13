package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

import com.example.entity.User;
import com.example.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService as;
	
	@GetMapping("/all")
	public List<User> getUser(){
		return as.getUser();
	}	
		@PostMapping("/add")
		public User addUser(@RequestBody @Valid User a){
			return as.addUser(a);
		}
		@PostMapping("/login")
		public Optional<User> loginUser(@RequestBody  User a) {
			return as.loginUser(a);
		}
}
