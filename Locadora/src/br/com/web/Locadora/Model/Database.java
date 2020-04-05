package br.com.web.Locadora.Model;

import java.util.ArrayList;

public class Database {
	
	//MARK:- Properties
	private ArrayList<Car> cars = new ArrayList<Car>();
	private ArrayList<User> users = new ArrayList<User>();
	
	public Database() {
		createMockCars();
		createMockUsers();
	}
	
	//MARK:- Methods
	public ArrayList<Car> getCars() {
		return this.cars;
	}
	
	public User fetchUser(String username) {
		
		for (User user : this.users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		
		return null;
	}
	
	//MARK:- Mocks
	private void createMockCars() {
		
		Car cars[] = {
				new Car("Toro", "Fiat", 100000.00), 
				new Car("Civic", "Honda", 90000.00),
				new Car("Polo", "VW", 40000.00),
				new Car("Astra", "Chevrolet", 20000.00)};
		
		for (Car car : cars) {
			this.cars.add(car);
		}
	}
	
	private void createMockUsers() {
		
		User users[] = {
				new User("lukinhas123", "1234"),
				new User("julin12", "1499"),
				new User("Pr332", "3543")};
		
		for(User user : users) {
			this.users.add(user);
		}
	}

}
