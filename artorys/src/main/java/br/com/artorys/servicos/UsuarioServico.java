package br.com.artorys.servicos;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import br.com.artorys.modelo.Cliente;
import br.com.artorys.util.JPAUtil;

public class UsuarioServico {
	public static boolean verificaSenha(Cliente cliente) {

		String sql = "select c from Cliente c where c.email = :email or c.nome = :nome and c.senha = :senha";

		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery(sql);
		query.setParameter("email", cliente.getEmail());
		query.setParameter("nome", cliente.getNome());
		query.setParameter("senha", cliente.getSenha());

		try {
			query.getSingleResult();
			return true;
		} catch (NoResultException nre) {
			return false;
		}
	}

	public static boolean verificaEmail(Cliente cliente) {

		String sql = "select c from Cliente c where c.email = :email or c.nome = :nome";

		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery(sql);
		query.setParameter("email", cliente.getEmail());
		query.setParameter("nome", cliente.getEmail());

		try {
			query.getSingleResult();
			return true;
		} catch (NoResultException nre) {
			return false;
		}
	}
}
