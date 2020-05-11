package br.com.locadora.model.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.locadora.model.bean.CarBean;
import br.com.locadora.model.dao.CarDAO;

public class CarBO {
	
	private CarDAO carDAO;
	private List<CarBean> cars;
	
	public CarBO() {
		this.carDAO = new CarDAO();
		this.cars = new ArrayList<CarBean>();
		this.cars = carDAO.fetchAll();
	}
	
	public List<CarBean> fetchAll() {	
		return this.cars;
	}
	
	public boolean create(String fabricante, String modelo, float preco, String cambio) {
		
		CarBean car = new CarBean();
		car.setCambio(cambio);
		car.setFabricante(fabricante);
		car.setModelo(modelo);
		car.setPreco(preco);
		car.setDisponivel(true);
		car.setUrlImage("uno.jpg");
		
		return carDAO.create(car);
	}
	
	public boolean alugarCarro(int id) {
		CarBean car = fetchCar(id);
		car.setDisponivel(false);
		return carDAO.update(car);
	}
	
	public boolean alterarCarro(CarBean car) {
		return carDAO.update(car);
	}
	
	public CarBean fetchCar(int id) {
						
		for(CarBean car : cars) {
			if (car.getId() == id) {
				return car;
			}
		}
		
		return null;
	}
	
	
	
	public void delete(int id) {
		carDAO.delete(id);
	}
	
}
