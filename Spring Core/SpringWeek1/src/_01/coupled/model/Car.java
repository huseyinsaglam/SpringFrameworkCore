package _01.coupled.model;

public class Car {
	
	
	private Tire tire; // tire = lastik; sahiplik anlam� var..

	 public Car() {
		super();
		this.tire = new Tire(); // g�bekten baglamis olduk ..Art�k car ile tire s�k� durumda bagl�d�r.
		// coupled durumu 
		// Car ile tire s�n�f� birbirine coupled durumunda (s�k� bagl�)
	} 
	 
	 
	 
	
	/*public Car(Tire tire) {
		super();
		this.tire = tire;
	} */

	
	
	
	public void drive()
	{
		tire.useTire();
	}

	
}
