package br.com.artorys.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.artorys.dao.DAO;
import br.com.artorys.modelo.Cartao;
import br.com.artorys.modelo.Endereco;
import br.com.artorys.util.JPAUtil;

@WebServlet(urlPatterns = "/comprarhistoria")
public class ServletHistoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cartao cartao = new Cartao();
		Endereco endereco = new Endereco();
		DAO dao = new DAO(JPAUtil.getEntityManager());
		
		endereco.setEstado(request.getParameter("estados-brasil"));
		endereco.setCidade(request.getParameter("cidade"));
		endereco.setBairro(request.getParameter("bairro"));
		endereco.setCep(request.getParameter("cep"));
		endereco.setRua(request.getParameter("rua"));
		endereco.setNumero(request.getParameter("numero_casa"));
		endereco.setComplemento(request.getParameter("complemento"));
		cartao.setBandeira(request.getParameter("bandeira"));
		cartao.setNumero(request.getParameter("numero-cartao"));
		cartao.setNomeimpresso(request.getParameter("nome"));
		cartao.setCodigoseguranca(request.getParameter("numeroseguranca"));
		dao.Insert(endereco);
		dao.Insert(cartao);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<script type=\"text/javascript\">");
		out.println("alert('COMPRA FEITA COM SUCESSO');");
		out.println("</script>");
		request.getRequestDispatcher("/front/baixarhistoria.html").include(request, response);
	}

}
