package com.microservices.account.dto;

import lombok.Data;

@Data
public class CustomerDTO {

	private String customerId;
	private String customerName;
	private String customerEmail;
	private String customerAddress;
}
