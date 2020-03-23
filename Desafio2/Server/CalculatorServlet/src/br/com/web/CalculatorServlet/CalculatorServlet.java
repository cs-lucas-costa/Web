package br.com.web.CalculatorServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.web.model.Calculator.Calculator;
import br.com.web.model.Calculator.Operation;

@WebServlet("/Calculator")
public class CalculatorServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		int firstNumber = Integer.parseInt(req.getParameter("firstNumber"));
		int secondNumber = Integer.parseInt(req.getParameter("secondNumber"));
		char operator = req.getParameter("operator").charAt(0);
		
		float result = Calculator.result(firstNumber, secondNumber, Operation.valueOf(operator));
						
		out.println("<html>");
		out.println("<body>");
		out.println("RESPOSTA : " + result);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
	
}
