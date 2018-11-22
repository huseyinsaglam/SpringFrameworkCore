package _01.decoupled.test;

import _01.decoupled.model.Car;
import _01.decoupled.model.GoodYear;
import _01.decoupled.model.Lassa;
import _01.decoupled.model.Vehicle;
import _01.decoupled.model.Wheel;
import _01.decoupled.model.Petlas;

public class DecoupledTest {

	public static void main(String[] args) {


		Vehicle car = new Car();
		Wheel lassa = new Lassa();
		
		car.setWheel(lassa);


		
		car.drive();

	}

}
