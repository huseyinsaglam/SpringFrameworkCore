package _02.stereotype.dao;

import org.springframework.stereotype.Repository;

import _02.stereotype.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	@Override
	public void insertPerson(Person person2) { // Person person2= new Person()
		System.out.println("PersonDAOImpl#insertPerson");
		
	}

}
