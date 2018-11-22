package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonDAOJPA;
import model.Person;

public class SpringJPATest {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jpa.xml");

		PersonDAOJPA dao = context.getBean(PersonDAOJPA.class);

		Person person1 = new Person("huseyin", "saglam", 1995);
		Person person2 = new Person("merve", "Saglam", 1996);

		dao.insert(person1);
		dao.insert(person2);

		context.close();
	}
}
