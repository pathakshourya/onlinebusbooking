package com.cg.model;

public class LoginBusOperator {

	private String busOperatorUsername;
	private String password;
	
	public String getBusOperatorUsername() {
		return busOperatorUsername;
	}

	public void setBusOperatorUsername(String busOperatorUsername) {
		this.busOperatorUsername = busOperatorUsername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public LoginBusOperator() {
		
	}
	
	public LoginBusOperator(String busOperatorUsername, String password) {
		super();
		this.busOperatorUsername = busOperatorUsername;
		this.password = password;
	}

	

}
