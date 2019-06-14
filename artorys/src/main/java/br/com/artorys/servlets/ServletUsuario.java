package br.com.artorys.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artorys.dao.DAO;
import br.com.artorys.modelo.Cliente;
import br.com.artorys.servicos.UsuarioServico;
import br.com.artorys.util.JPAUtil;

@WebServlet(urlPatterns = "/cadastro")
public class ServletUsuario extends HttpServlet {
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
		
			Cliente cliente = new Cliente();
			DAO dao = new DAO(JPAUtil.getEntityManager());
			
			
			cliente.setNome(request.getParameter("nome"));
			cliente.setSobrenome(request.getParameter("sobrenome"));
			cliente.setDt_nascimento(request.getParameter("nascimento"));
			cliente.setSexo(request.getParameter("sexo"));
			cliente.setCpf(request.getParameter("cpf"));
			cliente.setTelefone(request.getParameter("telefone"));
			cliente.setEmail(request.getParameter("email"));
			cliente.setSenha(request.getParameter("senha"));
		
			if (!UsuarioServico.verificaEmail(cliente)) {
				dao.Insert(cliente);
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<script type=\"text/javascript\">");
				out.println("alert('CADASTRO FEITO COM SUCESSO');");
				out.println("</script>");
				request.getRequestDispatcher("/front/home.html").include(request, response);
				
			}else {
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Email já cadastrado!');");
				out.println("</script>");
				request.getRequestDispatcher("/front/home.html").include(request, response);
				
			}
	}

}