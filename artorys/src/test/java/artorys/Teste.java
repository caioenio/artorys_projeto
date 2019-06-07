package artorys;

import java.util.ArrayList;

import org.junit.Test;

import br.com.artorys.dao.DAO;
import br.com.artorys.modelo.Cliente;

public class Teste {

	@Test
	public void Testando() {

		Cliente cliente = new Cliente();
		DAO dao = new DAO();

		String nome = "caio";
		String senha = "123";

		cliente.setNome("caio");
		cliente.setSenha("123");

		ArrayList<Cliente> clientes = dao.BuscarCliente(cliente);

		for (Cliente cliente1 : clientes) {
			System.out.println("Nome:" + cliente1.getNome());
			System.out.println("Senha:" + cliente1.getSenha());
		}

		if (nome == cliente.getNome() && senha == cliente.getSenha()) {
			System.out.println("FOI");
		}else {
			System.out.println("NAO FOI");	
		}
	}

}
