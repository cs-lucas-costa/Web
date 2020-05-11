package br.com.locadora.model.dao;

import java.util.List;

import br.com.locadora.model.bean.UserBean;
import br.com.locadora.model.database.DatabaseManager;
import br.com.locadora.model.database.ObjectDAO;

public class UserDAO implements ObjectDAO<UserBean>{
	
	//MARK:- Properties
	private DatabaseManager dbManager;
	private String table = "Pessoa";
	
	//MARK:- Initializer
	public UserDAO() {
		dbManager = DatabaseManager.shared();
	}
	
	//MARK:- Methods
	@Override
	public UserBean fetchId(String id) {
		return dbManager.select(table, id, UserBean.class);
	}
	
	@Override
	public List<UserBean> fetchAll() {
		return null;
	}

	@Override
	public boolean update(UserBean object) {
		return false;		
	}

	@Override
	public boolean create(UserBean object) {
		return false;
	}
	
}
