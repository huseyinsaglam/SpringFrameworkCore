package _01.javabased.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import _01.javabased.model.Adress;
import _01.javabased.model.Student;

@ComponentScan(value="_01.javabased.model")
@PropertySource(value="student.properties")
@Configuration
public class SpringConfiguration {
	
	@Autowired
	private Environment environment; 
	
	@Bean
	public Student cerateStudent()
	{
		Student student = new Student();
		// student.setName("huseyin");
		// student.setSurname("saglam");
		
		String name=environment.getProperty("name");
		String surname=environment.getProperty("surname");
		student.setName(name);
		student.setSurname(surname);
		return student;
	}

	@Bean
	public Adress createadress()
	{
		Adress adress = new Adress();
		adress.setCity("Hatay");
		adress.setCountry("TURKEY");
		return adress;
	} 
}
