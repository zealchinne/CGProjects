package com.payment.demo.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleAllException()
	{
		String err="Server side issue ::::::::";
		return ResponseEntity.ok().body(err);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> handleRunTimeException(RuntimeException exc)
	{
		String err="Server side issue ::::::::";
		return ResponseEntity.ok().body(exc.getMessage()+"http code :"+HttpStatus.NOT_FOUND);
	}
	

}
