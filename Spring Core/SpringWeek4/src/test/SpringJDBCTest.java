package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonJDBCDAO;
import dao.PersonJDBCDAOImpl;
import model.Person;

public class SpringJDBCTest {

	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.jdbc.xml");
		
		PersonJDBCDAO dao = context.getBean(PersonJDBCDAOImpl.class);
		
		Person person = new Person(2, "test name", "test surname", 1999);
		
		dao.insertPerson(person);
	}
}
