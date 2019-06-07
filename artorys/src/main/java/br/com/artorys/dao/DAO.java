package br.com.artorys.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import br.com.artorys.interfaces.Entidade;
import br.com.artorys.interfaces.InterfaceDAO;
import br.com.artorys.modelo.Cliente;
import br.com.artorys.util.JPAUtil;

public class DAO implements InterfaceDAO {

	EntityManager em = JPAUtil.getEntityManager();

	public void Insert(Entidade entidade) {
		em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();
	}

	public void Update(Entidade entidade) {
		em.getTransaction().begin();
		em.merge(entidade);
		em.getTransaction().commit();

	}

	public void Delete(Entidade entidade) {
		em.getTransaction().begin();
		em.remove(entidade);
		em.getTransaction().commit();

	}

	public Entidade Select(Entidade entidade) {
		em.getTransaction().begin();
		em.find(entidade.getClass(), entidade.pegarChavePrimaria());
		em.getTransaction().commit();

		return null;
	}

	public ArrayList<Cliente> BuscarCliente(Cliente cliente) {
		

		List<Cliente> retorno;
		String query = "select c from Cliente c where c.nome = :nome and c.senha = :senha";

		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transacao = manager.getTransaction();
		transacao.begin();

		TypedQuery<Cliente> cli = manager.createQuery(query, Cliente.class);
		
		cli.setParameter("nome",cliente.getNome());
		cli.setParameter("senha",cliente.getSenha());

		List<Cliente> c = cli.getResultList();

		transacao.commit();
		manager.close();

		retorno = c;

		return (ArrayList<Cliente>) retorno;

	}
}
