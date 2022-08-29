package com.example.solid;
class Vehicle{
	void igniteEngine() {
		System.out.println("Engine is started!");
	}
	void accelerate() {
		System.out.println("Accelerate");

	}
}

class DieselCar extends Vehicle{
	
	@Override
	 public void igniteEngine() {
		System.out.println("Engine of Diesel car ignited");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate");
		
	}
	 
	 
}

class ElectricCar extends Vehicle{

	public void switchOn() {
		System.out.println("Ready to go!");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate");
		
	}
	
}

public class LiskovExample {
	
	public static void main(String[] args) {
		Vehicle vehicle = new ElectricCar();
		ElectricCar eCar = new ElectricCar();
		drive(eCar);
	}
	
	public static void drive(Vehicle vehicle) {
		vehicle.igniteEngine();
		vehicle.accelerate();
	}
	

}
