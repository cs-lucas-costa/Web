package br.com.Locadora.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Locadora.model.bo.CarBO;


@WebServlet("/car")
public class CarController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String fabricante = req.getParameter("fabricante");
		System.out.println(req.getParameter("valor"));
		Double valor = Double.parseDouble(req.getParameter("valor"));
		CarBO carBo = new CarBO();
		
		carBo.create(nome, fabricante, valor);
		req.getRequestDispatcher("HomeView.jsp").forward(req, resp);
	}
}
