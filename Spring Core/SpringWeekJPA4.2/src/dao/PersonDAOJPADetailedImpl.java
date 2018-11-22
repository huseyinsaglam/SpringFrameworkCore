package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import model.Person;

public class PersonDAOJPADetailedImpl implements PersonDAOJPADetailed{

	private EntityManager entityManager;

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public void insert(Person person) {
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();
	}
}
