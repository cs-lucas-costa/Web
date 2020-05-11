package br.com.locadora.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.locadora.model.bean.CarBean;
import br.com.locadora.model.bo.CarBO;

@WebServlet("/car")
public class CarController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CarBO carBO;
	
	
	public CarController() {
		this.carBO = new CarBO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("carroID"));
		System.out.println("ID " + id);
		CarBean car = carBO.fetchCar(id);
		int cambio = car.getCambio().equals("Automático") ? 1 : 2;
				
		req.setAttribute("car", car);
		req.setAttribute("cambio", cambio);
		req.getRequestDispatcher("EditCarView.jsp").include(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		if("delete".equals(req.getParameter("action"))) {
			int id = Integer.parseInt(req.getParameter("carroID"));	
			carBO.delete(id);
			req.getRequestDispatcher("ListCarView.jsp").forward(req, resp);
			
		} else {
			
			String fabricante = req.getParameter("fabricante");
			String modelo = req.getParameter("modelo");
			float preco = Float.parseFloat(req.getParameter("preco"));
			int cambioOption = Integer.parseInt(req.getParameter("cambio"));
			String cambio = cambioOption == 1 ? "Automático" : "Manual";
			
			if(this.carBO.create(fabricante, modelo, preco, cambio)) {
				req.getRequestDispatcher("ListCarView.jsp").forward(req, resp);
			}	
		}
		
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		boolean isAlterar = Boolean.parseBoolean(req.getParameter("alterar"));
		int id = Integer.parseInt(req.getParameter("id"));

		if (isAlterar) {
			
			String fabricante = req.getParameter("fabricante");
			String modelo = req.getParameter("modelo");
			float preco = Float.parseFloat(req.getParameter("preco"));				
			int cambioOption = Integer.parseInt(req.getParameter("cambio"));
			String cambio = cambioOption == 1 ? "Automático" : "Manual";
			
			CarBean car = carBO.fetchCar(id);
			car.setCambio(cambio);
			car.setFabricante(fabricante);
			car.setModelo(modelo);
			car.setPreco(preco);
			
			carBO.alterarCarro(car);
			
		} else {
			if (carBO.alugarCarro(id)) {
				System.out.println("Update Car");
			}	
		}
		
		resp.setStatus(HttpServletResponse.SC_OK);
	}
	
	public List<CarBean> getCars() {
		return carBO.fetchAll();
	}
	
}
