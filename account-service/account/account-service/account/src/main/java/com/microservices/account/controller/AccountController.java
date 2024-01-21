package com.microservices.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.account.dto.CustomerDTO;
import com.microservices.account.dto.CustomerResponseDTO;
import com.microservices.account.entity.Customer;
import com.microservices.account.mapper.CustomerMapper;
import com.microservices.account.service.AccountService;

@RestController
@RequestMapping("/microservices")
public class AccountController {
	
	@Autowired
	private AccountService accService;
	
	@Autowired
	private CustomerMapper cusMapper;
	@PostMapping(path="/createAccount")
	public ResponseEntity<CustomerResponseDTO> createAccount(@RequestBody CustomerDTO dto) {
		Customer customer = accService.createCustomer(dto);
		return ResponseEntity.ok(cusMapper.toDto(customer));
		
	}
}
