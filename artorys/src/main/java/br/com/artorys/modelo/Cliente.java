package br.com.artorys.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.artorys.interfaces.Entidade;

@Entity
public class Cliente extends Usuario implements Entidade {
	@Column(name = "DS_TELEFONE")
	private String telefone;
	@Column(name = "NM_CPF")
	private String cpf;
	@OneToOne()
	private Endereco endereco;
	@OneToOne()
	private Cartao cartao;

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Object pegarChavePrimaria() {
		return super.getId();
	}

}
