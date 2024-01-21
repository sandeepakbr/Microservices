package com.microservices.account.service;

import com.microservices.account.dto.CustomerDTO;
import com.microservices.account.entity.Customer;


public interface AccountService {
	
	public Customer createCustomer(CustomerDTO dto);

}
