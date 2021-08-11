package com.cg.exception;

public class BusRouteNotFoundException extends RuntimeException {
	
	public BusRouteNotFoundException() {};
	
	public BusRouteNotFoundException(String msg) {
		super(msg);
	};
	

}
