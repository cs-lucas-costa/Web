package br.com.Locadora.controller;

import java.util.List;

import br.com.Locadora.model.bean.CarBean;
import br.com.Locadora.model.bo.CarBO;

public class HomeController {
	
	private CarBO carBo;
	
	public HomeController() {
		this.carBo = new CarBO();
	}
	
	public List<CarBean> getCars() {
		return this.carBo.getAllCars();
	}
	

}
