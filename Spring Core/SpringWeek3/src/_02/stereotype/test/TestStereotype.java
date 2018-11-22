package _02.stereotype.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _02.stereotype.model.Person;
import _02.stereotype.service.PersonService;

public class TestStereotype {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("02.stereotype.xml");
 
		PersonService personService = context.getBean("pService",PersonService.class);
		
		Person person = new Person();
		personService.insertPerson(person);
		
		context.close();
	}

}
