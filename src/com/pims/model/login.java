package com.pims.model;

public class login {
	private String username;
	private String password1;
	
	public login(String username, String password1) {
		super();
		this.username = username;
		this.password1 = password1;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}

}
