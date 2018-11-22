package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.PersonDAOJPADetailed;
import model.Person;

public class SpringJPADetailedTest {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jpa.detailed.xml");

		PersonDAOJPADetailed dao = context.getBean(PersonDAOJPADetailed.class);

		Person person1 = new Person("test name", "test surname", 1999);
		Person person2 = new Person("test name2", "test surname2", 1999);

		dao.insert(person1);
		dao.insert(person2);

	}
}
