package br.com.artorys.servicos;

import br.com.artorys.modelo.Cliente;

public class ValidaCliente {

	public void Valida(Cliente cliente) throws Exception {

		if (cliente.getNome() == "") {
			throw new Exception("CAMPO DE NOME NÃO PODE SER VAZIO");

		}
	}

}
