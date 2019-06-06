package br.com.artorys.modelo;

import java.util.ArrayList;

import org.junit.Test;

import br.com.artorys.dao.DAO;

public class Teste {

	@Test
	public void Testando() {

		Cliente cliente = new Cliente();
		DAO dao = new DAO();

		cliente.setNome("caio");
		cliente.setSenha("123");

		ArrayList<Cliente> clientes = dao.BuscarCliente();

		for (Cliente cliente1 : clientes) {
			System.out.println("Cliente:" + cliente1.getNome());
			System.out.println("Senha:" + cliente1.getSenha());

		}
	}

}
