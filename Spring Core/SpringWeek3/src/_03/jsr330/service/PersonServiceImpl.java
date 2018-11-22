package _03.jsr330.service;

import javax.inject.Inject;
import javax.inject.Named;



import _03.jsr330.dao.PersonDAO;
import _03.jsr330.model.Person;



@Named(value="jsr330x")
public class PersonServiceImpl implements PersonService{

	@Inject
	private PersonDAO personDAO;
	
	@Override
	public void insertPerson(Person person) {
	System.out.println("PersonServiceImpl#insertPerson");
	personDAO.insertPerson(person);	
	}

}
