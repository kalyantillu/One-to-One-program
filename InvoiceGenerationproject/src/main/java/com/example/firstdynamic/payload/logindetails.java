package com.example.firstdynamic.payload;

public class logindetails {

	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) { 
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public logindetails(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public logindetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "logindetails [email=" + email + ", password=" + password + "]";
	}
	
	
}
