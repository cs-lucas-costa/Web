package br.com.Locadora.model.bean;

public class PersonBean {
	
	private String email;
	private String password;
	
	public PersonBean(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public String getKey() {
		return email;
	}
	
	public boolean isEqual(String password) {
		return this.password.equals(password);
	}
	
}
