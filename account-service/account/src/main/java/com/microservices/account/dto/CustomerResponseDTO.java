package com.microservices.account.dto;

import lombok.Data;

@Data
public class CustomerResponseDTO {

	private String customerName;
	private String customerEmail;
	private String customerAddress;
	private AccountResponseDTO account;
}
