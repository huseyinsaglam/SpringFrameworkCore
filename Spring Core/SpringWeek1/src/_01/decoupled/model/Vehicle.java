package _01.decoupled.model;

public interface Vehicle {  // vehicle = araç;
	

	public void setWheel(Wheel wheel); // decoupling yapabilmemiz için...
	public void drive();
	

}
