package model;

public class Person {
	
	private int id;
	private String name;
	private String surname;
	private int birthyear;
	
	
	
	
	
	public Person(int id, String name, String surname, int birthyear) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthyear = birthyear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", birthyear=" + birthyear + "]";
	}
	
	
	

}
