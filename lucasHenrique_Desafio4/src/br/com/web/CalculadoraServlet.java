package br.com.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.web.model.Calculator;
import br.com.web.model.Operation;

@WebServlet("/calculadora")
public class CalculadoraServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("resultado.jsp");
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		char operator = req.getParameter("operador").charAt(0);
		float result = Calculator.result(number1, number2, Operation.valueOf(operator));
		
		req.setAttribute("result", result);
		requestDispatcher.forward(req, resp);
	}
	
	
}
