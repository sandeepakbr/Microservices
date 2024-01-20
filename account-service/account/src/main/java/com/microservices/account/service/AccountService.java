package com.microservices.account.service;

import org.springframework.stereotype.Component;

import com.microservices.account.dto.CustomerDTO;


public interface AccountService {
	
	public void createCustomer(CustomerDTO dto);

}
