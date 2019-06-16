package br.com.artorys.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.artorys.interfaces.Entidade;

@Entity
public class Cartao implements Entidade {
	
	@Id
	@Column(name = "CD_CARTAO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "DS_PRODUTOCOMPRADO")
	private String produtocomprado;
	
	@Column(name = "DS_BANDEIRA")
	private String bandeira;
	
	@Column(name = "NM_CARTAO")
	private String numero;
	
	@Column(name = "NM_CODIGOSEGURANCA")
	private String codigoseguranca;
	
	@Column(name = "NM_IMPRESSOCARTAO")
	private String nomeimpresso;
	
	

	public String getProdutocomprado() {
		return produtocomprado;
	}

	public void setProdutocomprado(String produtocomprado) {
		this.produtocomprado = produtocomprado;
	}

	public String getNomeimpresso() {
		return nomeimpresso;
	}

	public void setNomeimpresso(String nomeimpresso) {
		this.nomeimpresso = nomeimpresso;
	}

	public String getCodigoseguranca() {
		return codigoseguranca;
	}

	public void setCodigoseguranca(String codigoseguranca) {
		this.codigoseguranca = codigoseguranca;
	}
	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@ManyToOne()
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Object pegarChavePrimaria() {
		return this.getCodigo();
	}

}
