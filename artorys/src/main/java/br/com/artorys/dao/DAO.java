package br.com.artorys.dao;

import javax.persistence.EntityManager;
import br.com.artorys.interfaces.Entidade;
import br.com.artorys.interfaces.InterfaceDAO;

public class DAO implements InterfaceDAO {

	EntityManager em;

	public DAO(EntityManager em) {
		this.em = em;
	}

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
}
