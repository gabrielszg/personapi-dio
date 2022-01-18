package com.cognizant.dio.jwt.data;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserData implements Serializable {
	
	//DTO
	private String userName;
	private String password;
}