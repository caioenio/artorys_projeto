package br.com.artorys.modelo;

import org.junit.Test;

import br.com.artorys.dao.DAO;

public class Teste {

	@Test
	public void Testando() {
		
		DAO dao = new DAO();
		Administrador administrador = new Administrador();
		administrador.setNome("CAIO");
		administrador.setEmail("caio@hotmail.com");
		administrador.setSenha("12345");
		administrador.setMatricula(1);
		dao.Insert(administrador);

	}

}
