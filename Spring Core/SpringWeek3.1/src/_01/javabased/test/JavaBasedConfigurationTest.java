package _01.javabased.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import _01.javabased.configuration.SpringConfiguration;
import _01.javabased.model.Student;

public class JavaBasedConfigurationTest {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Student student =context.getBean(Student.class);
        System.out.println(student);
		
	}

}
