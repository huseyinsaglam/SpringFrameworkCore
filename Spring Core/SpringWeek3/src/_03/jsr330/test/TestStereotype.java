package _03.jsr330.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _03.jsr330.model.Person;
import _03.jsr330.service.PersonService;


public class TestStereotype {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("03.jsr330.xml");
 
		PersonService personService = context.getBean("jsr330x",PersonService.class);
		
		Person person = new Person();
		personService.insertPerson(person);
		
		context.close();
	}

}
