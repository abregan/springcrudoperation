package com.spring.exception;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
	public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
	            HttpHeaders headers, HttpStatusCode status, WebRequest request) {
	         List<String> errors = new ArrayList<String>();
	            for (FieldError error : ex.getBindingResult().getFieldErrors()) {
	                System.out.println("=====>"+error.getDefaultMessage());
	                errors.add(error.getField() + ": " + error.getDefaultMessage());
	            }
	            /*for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
	                System.out.println("2222=====>"+error.getDefaultMessage());
	                errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
	            }*/
				return null;
	
	    }
}
