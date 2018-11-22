package _03.jsr330.dao;

import javax.inject.Named;



import _03.jsr330.model.Person;


@Named
public class PersonDAOImpl implements PersonDAO {

	@Override
	public void insertPerson(Person person) {
		System.out.println("PersonDAOImpl#insertPerson");
		
	}

}
