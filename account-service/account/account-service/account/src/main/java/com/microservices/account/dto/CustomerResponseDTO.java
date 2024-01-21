package com.microservices.account.dto;

import java.util.List;

import lombok.Data;

@Data
public class CustomerResponseDTO {

	private String customerName;
	private String customerEmail;
	private String customerAddress;
	private List<AccountResponseDTO> account;
}
