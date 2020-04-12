package br.com.Locadora.model.dao;

import br.com.Locadora.model.bean.PersonBean;
import br.com.Locadora.model.database.Database;

public class PersonDao {
	
	private Database database;
	
	public PersonDao() {
		this.database = Database.shared();
	}
	
	//MARK:- Methods
	public boolean create(PersonBean person) {
		return database.create(person);
	}
	
	public PersonBean fetch(String email) {
		return database.fetch(email);
	}
	
}
