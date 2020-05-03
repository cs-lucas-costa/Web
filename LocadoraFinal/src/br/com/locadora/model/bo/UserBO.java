package br.com.locadora.model.bo;

import br.com.locadora.model.bean.UserBean;
import br.com.locadora.model.dao.UserDAO;

public class UserBO {

	//MARK:- Properties
	private UserDAO dao;
	
	
	//MARK:- Initializer
	public UserBO() {
		this.dao = new UserDAO();
	}
	
	
	//MARK:- Methods
	public boolean validateLogin(String username, String password) {
		UserBean user = dao.fetchId(username);
		
		if (user == null) {
			return false; 
		}
		
		return user.getPassword().equals(password);		
	}
	
	
}
