package _02.consructor.injection;

public class ConsructorConfuse {
	
	private String name;
	private int age;
	
	
	
	
	public ConsructorConfuse(String name) {
		super();
		this.name = name;
	}
	
	
	
	public ConsructorConfuse(int age) {
		super();
		this.age = age;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "ConsructorConfuse [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	

}
