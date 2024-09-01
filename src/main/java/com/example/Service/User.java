package com.example.Service;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String userName = "example@gmail.com";
	private String password = "Next@321";
	
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	

}
