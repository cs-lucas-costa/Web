package br.com.locadora.model.bo;

import java.util.List;

import br.com.locadora.model.bean.CarBean;
import br.com.locadora.model.dao.CarDAO;

public class CarBO {
	
	private CarDAO carDAO;
	
	public CarBO() {
		this.carDAO = new CarDAO();
	}
	
	public List<CarBean> fetchAll() {
		
		List<CarBean> cars = carDAO.fetchAll();
		return cars;
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
	
	public boolean update(int id) {
		
		CarBean car = new CarBean();
		car.setId(id);
		car.setDisponivel(false);
		
		return carDAO.update(car);
	}
	
	
}
