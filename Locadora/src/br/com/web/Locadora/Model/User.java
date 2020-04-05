package br.com.web.Locadora.Model;

public class User {
	
	//MARK:- Properties
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	//MARK:- Methods
	public String getUsername() {
		return username;
	}
	
	public boolean isEqualPassword(String password) {
		return this.password.equals(password);
	}
	

}
