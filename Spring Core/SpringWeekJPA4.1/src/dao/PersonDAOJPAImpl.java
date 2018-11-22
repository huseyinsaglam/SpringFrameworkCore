package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Person;

public class PersonDAOJPAImpl implements PersonDAOJPA{

	
	
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SpringJPA_PU");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	/*private EntityManager entityManager;
	private EntityManagerFactory factory;
	

	public PersonDAOJPAImpl(EntityManagerFactory entityManagerFactory) {
		super();
		factory = entityManagerFactory;
		entityManager = factory.createEntityManager();
	}*/

	
	
	
	



/*


	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}







	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}







	public EntityManager getEntityManager() {
		return entityManager;
	}







	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
*/
	
	public PersonDAOJPAImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}








	public PersonDAOJPAImpl(EntityManagerFactory entityManagerFactory) {
		super();
		this.entityManagerFactory = entityManagerFactory;
	}
	
	
	

	@Override
	public void insert(Person person) {
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();
	}








	




	
	

}
