package _01.autowired.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private String name;
	private String surname;
	
	
	// NOT:@Autowired anotasyonu sayesinde bir bean i�erisindeki de�erleri ba�ka beanin i�erisine enjekte edebilir 
	//de�erlerini koruyarak kullanabiliriz.
	//@Autowired anotasyonunu bir de�i�ken, setter ya da yap�land�r�c� metot �zerinde kullan�labilmekteyiz.
	//Bir senaryo yaparak @Autowired kullan�m�na bakal�m.
	
	
	@Autowired
	@Qualifier(value="Adress2")
	private Adress adress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", adress=" + adress + "]";
	}
	
	
	

}
