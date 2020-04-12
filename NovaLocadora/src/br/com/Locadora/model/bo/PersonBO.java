package br.com.Locadora.model.bo;

import br.com.Locadora.model.bean.PersonBean;
import br.com.Locadora.model.dao.PersonDao;

public class PersonBO {
	
	private PersonDao personDao;
	
	public PersonBO() {
		this.personDao = new PersonDao();
	}
	
	public boolean cadastrar(String email, String password) {
		
		PersonBean person = new PersonBean(email, password);
		return this.personDao.create(person);
	}
	
	public boolean logar(String email, String password) {
		
		PersonBean person = this.personDao.fetch(email);
		
		if (person != null) {
			return person.isEqual(password);
		}
		
		return false;
	}

}
