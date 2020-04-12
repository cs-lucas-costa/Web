package br.com.Locadora.model.database;

import java.util.ArrayList;
import java.util.List;

import br.com.Locadora.model.bean.CarBean;
import br.com.Locadora.model.bean.PersonBean;

public class Database {
	
	private static final Database SINGLE_INSTANCE = new Database();
	
	//MARK:- Properties
	private static List<PersonBean> listPerson;
	private static List<CarBean> listCars;
	
	private Database() {
		listPerson = new ArrayList<PersonBean>();
		listCars = new ArrayList<CarBean>();
		mockPerson();
		mockCars();
	}
	
	//MARK:- Properties
	public boolean create(PersonBean newPerson) {	
		
		if (fetch(newPerson.getKey()) == null) {
			listPerson.add(newPerson);
			return true;
		}
		
		return false;
	}
	
	public PersonBean fetch(String key) {
		
		for (PersonBean person : listPerson) {
			if (person.getKey().equals(key)) {
				System.out.println("Entrou");
				return person;
			}
		}
		
		return null;
	}
	
	public void create(CarBean car) {
		listCars.add(car);
	}
	
	public List<CarBean> getListCars() {
		return listCars;
	}
	
	public static Database shared() {
		return SINGLE_INSTANCE;
	}

	//MARK:- Mocks
	private static void mockPerson() {
		listPerson.add(new PersonBean("lucas@gmail.com", "1234"));
	}
	
	private static void mockCars() {
		listCars.add(new CarBean("Fusca", "VW", 11000.0));
		listCars.add(new CarBean("Toro", "Fiat", 99000.0));
		listCars.add(new CarBean("Palio", "Fiat", 44000.0));
	}
	
	
}
