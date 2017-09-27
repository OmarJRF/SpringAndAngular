package com.myportfoliospring.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.myportfoliospring.constant.ViewConstant;

@ControllerAdvice
public class ErrorController {
	
	

	@ExceptionHandler(Exception.class)
	public String showInternalServerError() {
		return ViewConstant.ERROR_500;
		
	}
}
