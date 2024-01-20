package com.microservices.account.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponseDTO {
 
	private String apiPath;
	private String errorMsg;
	private HttpStatus errorCode;
	private LocalDateTime errorTime;
}
