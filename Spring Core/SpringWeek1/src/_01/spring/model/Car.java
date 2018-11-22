package _01.spring.model;

public class Car implements Vehicle {
	
	private Wheel wheel;

	@Override
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;

	}

	@Override
	public void drive() {
	
       wheel.useTire();
	}

}
