package br.com.artorys.modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Usuario {
	@Id
	@Column(name = "CD_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "EM_USUARIO")
	private String email;
	@Column(name = "NM_SENHA_USUARIO")
	private String senha;
	@Column(name = "DS_USUARIO")
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
