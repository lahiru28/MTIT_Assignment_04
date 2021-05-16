package com.sliit.mtit.microservice.accountservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.sliit.mtit.microservice.accountservice.dto.UserRequest;
import com.sliit.mtit.microservice.accountservice.dto.UserResponse;

@RestController
@RequestMapping("/users")
public class AccountController {

	
	@PostMapping(consumes = "application/json",produces = "application/json")
	public @ResponseBody UserResponse createUser(@RequestBody UserRequest userRequest) {
		
		
		System.out.println("User details:" +userRequest);
		
		var userResponse = new UserResponse();
		userResponse.setUserId(UUID.randomUUID().toString());
		userResponse.setMessage("Successfully created the user");
		
		return userResponse;
		
	}
}
