package com.microservices.account.dto;

import java.util.List;

import lombok.Data;

@Data
public class CustomerDTO {

	private String customerId;
	private String customerName;
	private String customerEmail;
	private String customerAddress;
	private List<AccountDTO> account;
}
