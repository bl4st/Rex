package br.bl4.rex.server;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.br.bl4.teste.TesteEjbLocal;

@WebServlet("/RexServlet")
public class RexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private TesteEjbLocal testeEjb;

	public RexServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String text = request.getParameter("text");
		String newText = this.testeEjb.addPipe(text);
		response.getWriter().print(newText);
	}

}
