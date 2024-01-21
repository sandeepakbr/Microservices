package com.microservices.account.dto;

import lombok.Data;

@Data
public class AccountDTO {

	private String accountType;
	private String accountHolderName;
	private String accountNumber;
	private Long accountBalance;
	private String customerId;
}
