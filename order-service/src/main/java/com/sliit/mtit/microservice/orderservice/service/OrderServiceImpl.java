package com.sliit.mtit.microservice.orderservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sliit.mtit.microservice.orderservice.dto.OrderRequest;
import com.sliit.mtit.microservice.orderservice.dto.OrderResponse;
import com.sliit.mtit.microservice.orderservice.dto.UserCreationRequest;
import com.sliit.mtit.microservice.orderservice.dto.UserCreationResponse;

@Service
public class OrderServiceImpl {

	@Autowired
	private RestTemplate restTemplate;
	
	public OrderResponse createOrder(OrderRequest orderRequest) {
		
		var userCreationRequest = new UserCreationRequest();
		userCreationRequest.setAge(orderRequest.getAge());
		userCreationRequest.setFullName(orderRequest.getFullName());
		ResponseEntity<UserCreationResponse>userCreationResponse = restTemplate.postForEntity("http://localhost:8080/users",userCreationRequest,UserCreationResponse.class);
		
		
		
		var orderResponse  = new OrderResponse();
		orderResponse.setOrderId(UUID.randomUUID().toString());
		orderResponse.setUserId(userCreationResponse.getBody().getUserId());
		orderResponse.setMessage("Sucessfully create the order");
		
		return orderResponse;
		
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
}
 