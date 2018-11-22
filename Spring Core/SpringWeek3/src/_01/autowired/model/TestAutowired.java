package _01.autowired.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("01.autowired.xml");
		
		Employee employee =context.getBean("employee1",Employee.class); //lookup yapiyoruz..
        System.out.println(employee);
        context.close();
	}

}
