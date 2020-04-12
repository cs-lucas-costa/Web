package br.com.Locadora.model.dao;

import java.util.List;

import br.com.Locadora.model.bean.CarBean;
import br.com.Locadora.model.database.Database;

public class CarDao {
	
	private Database database;
	
	public CarDao() {
		this.database = Database.shared();
	}
	
	public void createCar(CarBean car) {
		this.database.create(car);
	}
	
	public List<CarBean> fetchAll() {
		return database.getListCars();
	}

}
