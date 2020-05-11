package br.com.locadora.model.dao;

import java.util.List;

import br.com.locadora.model.bean.CarBean;
import br.com.locadora.model.database.DatabaseManager;
import br.com.locadora.model.database.ObjectDAO;

public class CarDAO implements ObjectDAO<CarBean> {

	private DatabaseManager dbmanager;
	
	public CarDAO() {
		dbmanager = DatabaseManager.shared();
	}
	
	@Override
	public CarBean fetchId(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<CarBean> fetchAll() {
		return dbmanager.selectAll("Carro");
	}

	@Override
	public boolean update(CarBean object) {
		return dbmanager.update("Carro", object);
	}

	@Override
	public boolean create(CarBean object) {
		return dbmanager.insert(object, "Carro");
	}
	
	public void delete(int id) {
		dbmanager.delete("Carro", id, CarBean.class);
	}
	
}
