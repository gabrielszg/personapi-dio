package com.cognizant.dio.jwt.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.dio.jwt.data.UserData;

@RestController
public class AuthController {
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public AuthController(BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	@PostMapping("/login")
	public void login(@RequestBody UserData user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	}
}
