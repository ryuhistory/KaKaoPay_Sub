package com.ex.biz.controller;

import java.util.HashMap;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	
  @ExceptionHandler(BrNotFoundException.class)
  @ResponseBody
  protected Map<String,String>  handleUnauthorizedException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
    
  
	Map<String,String> output = new HashMap<String,String>();
	output.put("code ","404");
	output.put("메세지", "br code not found error");
  
    return output;
  }
}