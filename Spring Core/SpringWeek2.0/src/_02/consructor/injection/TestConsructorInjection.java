package _02.consructor.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsructorInjection {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("02.consructor.injection.xml");
		Person person = context.getBean("person1",Person.class);
		System.out.println(person);
		
		
		
		Person person2 = context.getBean("person2",Person.class);
		System.out.println(person2);
		
		
		ConsructorConfuse confuse1 = context.getBean("consructorconfuse1",ConsructorConfuse.class);
		System.out.println(confuse1);
		
		
		ConsructorConfuse confuse2 = context.getBean("consructorconfuse2",ConsructorConfuse.class);
		System.out.println(confuse2);
		context.close();

	}

}
