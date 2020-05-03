package br.com.locadora.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.locadora.model.bo.UserBO;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserBO userBo = new UserBO();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if (userBo.validateLogin(username, password)) {
			req.getRequestDispatcher("HomeView.jsp").forward(req, resp);
		} else {
			createAlert("Usuário ou senha inválidos", resp.getWriter());
			req.getRequestDispatcher("loginView.htm").include(req, resp);
		}
	}
	
	private void createAlert(String message, PrintWriter out) {
		out.println("<script type=\"text/javascript\">");
		out.println("alert('" + message + "');");
		out.println("</script>");
	}
	
}
