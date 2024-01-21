package com.microservices.account.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class AccountCreationException extends RuntimeException{

        public AccountCreationException(String message) {
        	super(message);
        }
}
