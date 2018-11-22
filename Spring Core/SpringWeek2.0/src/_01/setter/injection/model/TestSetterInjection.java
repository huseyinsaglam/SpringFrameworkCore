package _01.setter.injection.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterInjection {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("01.setter.injection.xml");

		Employee employee = context.getBean("emp1",Employee.class); // dependency lookup oluyor;
		System.out.println(employee);
		
		Employee employee2 = context.getBean("emp2",Employee.class);
		System.out.println(employee2 );
		
		Employee employee3 = context.getBean("emp4",Employee.class);
		System.out.println(employee3 );
		context.close();
		
		
	}

}
