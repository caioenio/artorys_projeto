package br.com.artorys.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artorys.dao.DAO;
import br.com.artorys.modelo.Cliente;

@WebServlet(urlPatterns = "/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLogin() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Cliente cliente = new Cliente();
		DAO dao = new DAO();
		
		cliente.setNome(nome);
		cliente.setSenha(senha);

		ArrayList<Cliente> clientes = dao.BuscarCliente(cliente);

		for (Cliente cliente1 : clientes) {
			System.out.println("Nome:" + cliente1.getNome());
			System.out.println("Senha:" + cliente1.getSenha());
		}
		

		if (nome == cliente.getNome() && senha == cliente.getSenha()) {
			request.getRequestDispatcher("/front/homelogin.html").include(request, response);
		} else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Email ou senha incorretos');");
			out.println("</script>");
			request.getRequestDispatcher("/front/home.html").include(request, response);
		}
	}

}
