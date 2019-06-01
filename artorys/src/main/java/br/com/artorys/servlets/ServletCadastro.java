package br.com.artorys.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artorys.dao.DAO;
import br.com.artorys.modelo.Cliente;

@WebServlet(urlPatterns = "/cadastro")
public class ServletCadastro extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5897796832769458187L;

	@Override
	public void init() {
		System.out.println("Init() executado");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet() executado");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DAO dao = new DAO();
		Cliente cliente = new Cliente();
		cliente.setNome(request.getParameter("nome"));

		if (cliente.getNome() != null) {
			request.setAttribute("mensagem", "O nome não pode ser nulo");
		} else {
			dao.Insert(cliente);
			response.getWriter().print("DADOS SALVOS!!");
		}
	}

}