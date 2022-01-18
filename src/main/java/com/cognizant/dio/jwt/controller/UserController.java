package com.cognizant.dio.jwt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.dio.jwt.data.UserData;
import com.cognizant.dio.jwt.service.UserDetailsServiceImpl;

@RestController
public class UserController {
	
	private final UserDetailsServiceImpl userDetailsService;
	
	public UserController(UserDetailsServiceImpl userDetailsService) {
		super();
		this.userDetailsService = userDetailsService;
	}
	
	@RequestMapping("/all-users")
	public List<UserData> ListAllUsers() {
		return userDetailsService.listUsers();
	}
}
