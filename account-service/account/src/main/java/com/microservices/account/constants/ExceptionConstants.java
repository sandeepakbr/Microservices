package com.microservices.account.constants;

import lombok.Data;

@Data
public class ExceptionConstants {
	
	private ExceptionConstants() {};
	public static final String SAVINGS="Savings";
	public static final String ADDRESS="123,Main Street , New York.";
	public static final String STATUS_201="201";
	public static final String MESSAGE_201="Account Created Successfully.";
	public static final String STATUS_200="200";
	public static final String MESSAGE_200="Request Processed Successfully.";
	public static final String STATUS_500="500";
	public static final String MESSAGE_500="An Error Occured While Creating Account.";

}
