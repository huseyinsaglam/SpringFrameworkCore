package _02.stereotype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _02.stereotype.dao.PersonDAO;
import _02.stereotype.model.Person;

@Service(value="pService")
public class PersonServiceImpl implements PersonService{

    @Autowired // Autowired kulllandigimiz zaman getter,setter,counstroctor gerek yoktur...
	private PersonDAO personDAO;
	
	@Override
	public void insertPerson(Person person1) { //Person person1 = new Person()
	System.out.println("PersonServiceImpl#insertPerson");
	personDAO.insertPerson(person1);	
	}

}
