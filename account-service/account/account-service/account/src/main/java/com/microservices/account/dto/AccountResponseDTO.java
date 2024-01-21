package com.microservices.account.dto;

import lombok.Data;

@Data
public class AccountResponseDTO {

	private String accountType;
	private String accountHolderName;
	private String accountNumber;
	private Long accountBalance;

}
