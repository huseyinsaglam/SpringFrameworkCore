package _01.coupled.model;

public class Car {
	
	
	private Tire tire; // tire = lastik; sahiplik anlamı var..

	 public Car() {
		super();
		this.tire = new Tire(); // göbekten baglamis olduk ..Artık car ile tire sıkı durumda baglıdır.
		// coupled durumu 
		// Car ile tire sınıfı birbirine coupled durumunda (sıkı baglı)
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
