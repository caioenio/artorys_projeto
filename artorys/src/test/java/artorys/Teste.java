package artorys;

import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.Test;

import br.com.artorys.dao.DAO;
import br.com.artorys.modelo.Cliente;

public class Teste {

	@Test
	public void teste_Caio_1234() {
		Cliente cli = new Cliente();
		
		cli.setNome("caio");
		cli.setSenha("1234");

		DAO dao = new DAO();

		ArrayList<Cliente> clientes = dao.BuscarCliente();
		{

			for (Cliente c : clientes) {
				System.out.println("Nome:" + c.getNome());
				System.out.println("Senha:" + c.getSenha());

			}
		}
		
		assertNotNull(clientes);
		assertTrue(clientes.isEmpty());
	}
	
	@Test
	public void teste_Caio_123() {
		Cliente cli = new Cliente();
		

		DAO dao = new DAO();

		ArrayList<Cliente> clientes = dao.BuscarCliente();
		{

			for (Cliente c : clientes) {
				System.out.println("Nome:" + c.getNome());
				System.out.println("Senha:" + c.getSenha());

			}
		}
		
		assertNotNull(clientes);
		assertFalse(clientes.isEmpty());
	}

}