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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String fabricante = req.getParameter("fabricante");
		String modelo = req.getParameter("modelo");
		float preco = Float.parseFloat(req.getParameter("preco"));
		int cambioOption = Integer.parseInt(req.getParameter("cambio"));
		String cambio = cambioOption == 1 ? "Automático" : "Manual";
		
		if(this.carBO.create(fabricante, modelo, preco, cambio)) {
			req.getRequestDispatcher("ListCarView.jsp").forward(req, resp);
		}	
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		resp.setContentType("text/plain");
	    resp.setCharacterEncoding("UTF-8");
	    resp.getWriter().write("UPDATE CAR");
		
		if (carBO.update(id)) {
			System.out.println("Update Car");
			resp.setStatus(HttpServletResponse.SC_OK);
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	public List<CarBean> getCars() {
		return carBO.fetchAll();
	}
	
}
