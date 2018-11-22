package _01.setter.injection.model;

public class Employee { // isci demek;

	
	private String name;
	private String surname;
	private long salary;
	private int age;
	
	private Department department;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name");
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		System.out.println("surname");
		this.surname = surname;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", salary=" + salary + ", age=" + age
				+ ", department=" + department + "]";
	}
	
	
	
	
}
