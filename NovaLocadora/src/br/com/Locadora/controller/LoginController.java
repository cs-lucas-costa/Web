package br.com.Locadora.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.Locadora.model.bo.PersonBO;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PersonBO personBO = new PersonBO();
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		resp.setContentType("text/html;charset=UTF-8");
	
		
		if(req.getParameter("login") != null) {
			
			System.out.println("Teu rabo!");
			
			if(personBO.logar(email, password)) {
				req.getRequestDispatcher("HomeView.jsp").include(req, resp);
			} else {	
				createAlert("Usuário ou senha inválida", resp.getWriter());
				req.getRequestDispatcher("LoginView.jsp").include(req, resp);
			}
			
		} else {
			
			if (personBO.cadastrar(email, password)) {
				createAlert("Usuário cadastrado", resp.getWriter());
				req.getRequestDispatcher("HomeView.jsp").include(req, resp);

			} else {
				createAlert("Usuário já está cadastrado", resp.getWriter());
				req.getRequestDispatcher("LoginView.jsp").include(req, resp);
			}
			
		}
		
	}
	
	private void createAlert(String message, PrintWriter out) {
		out.println("<script type=\"text/javascript\">");
		out.println("alert('" + message + "');");
		out.println("</script>");
	}
}
