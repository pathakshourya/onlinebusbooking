package com.cg.exception;


import java.time.LocalDateTime;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(BusOperatorNotFoundException.class)
	public ResponseEntity<MyErrorDetails> handleBusOperatorNotFoundException(BusOperatorNotFoundException exp,WebRequest req){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), exp.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(BusNotFoundException.class)
	public ResponseEntity<MyErrorDetails> handleBusNotFoundException(BusNotFoundException exp,WebRequest req){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), exp.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(BusRouteNotFoundException.class)
	public ResponseEntity<MyErrorDetails> handleBusRouteNotFoundException(BusRouteNotFoundException exp,WebRequest req){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), exp.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
}
