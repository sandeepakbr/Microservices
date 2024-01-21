package com.microservices.account.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler extends Exception {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponseDTO> handleGlobalException(Exception exception, WebRequest webReq){
		ErrorResponseDTO errorDto = new ErrorResponseDTO(
				webReq.getDescription(false),
				exception.getMessage(),
				HttpStatus.BAD_REQUEST,
				LocalDateTime.now()
				);
		return new ResponseEntity<>(errorDto,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AccountCreationException.class)
	public ResponseEntity<ErrorResponseDTO> handleCustomerAllreadyExist(AccountCreationException exception, WebRequest webReq){
		ErrorResponseDTO errorDto = new ErrorResponseDTO(
				webReq.getDescription(false),
				exception.getMessage(),
				HttpStatus.BAD_REQUEST,
				LocalDateTime.now()
				);
		return new ResponseEntity<>(errorDto,HttpStatus.BAD_REQUEST);
	}
	

}
