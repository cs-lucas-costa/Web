package br.com.web.Locadora.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.web.Locadora.Model.Database;
import br.com.web.Locadora.Model.User;

@WebServlet("/login")
public class ServerController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//MARK:- Properties
	private Database database = new Database();
	

	//MARK:- Methods
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = null;
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = database.fetchUser(username);
		
		PrintWriter out = resp.getWriter();
		
		resp.setContentType("text/html;charset=UTF-8");
				
		if (user == null) {
			
			dispatcher = req.getRequestDispatcher("LoginView.jsp");
			createAlert("Usuário não existente", out);
			dispatcher.include(req, resp);
			
		} else if (!user.isEqualPassword(password)) {
			
			dispatcher = req.getRequestDispatcher("LoginView.jsp");
			createAlert("Senha inválida", out);
			dispatcher.include(req, resp);
			
		} else {
			
			dispatcher = req.getRequestDispatcher("ListCarView.jsp");
			req.setAttribute("cars", database.getCars());
			dispatcher.forward(req, resp);
		}
		
		out.close();
			
	}	
	
	private void createAlert(String message, PrintWriter out) {
		out.println("<script type=\"text/javascript\">");
		out.println("alert('" + message + "');");
		out.println("</script>");
	}
	
}
