package br.com.Locadora.model.bo;

import java.util.List;

import br.com.Locadora.model.bean.CarBean;
import br.com.Locadora.model.dao.CarDao;

public class CarBO {
	
	private CarDao carDao;
	
	public CarBO() {
		this.carDao = new CarDao();
	}
	
	public List<CarBean> getAllCars() {
		return carDao.fetchAll();
	}
	
	public void create(String nome, String fabricante, Double valor) {
		CarBean car = new CarBean(nome, fabricante, valor);
		carDao.createCar(car);
	}
	
}
