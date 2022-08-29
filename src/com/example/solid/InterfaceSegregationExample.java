package com.example.solid;

/**
 * Clients should not be forced to depend upon interfaces that they do not use
 * It is to reduce the side effects and frequency of required changes by
 * splitting the software into multiple, independent parts.
 * 
 * @author adityajain
 *
 */

interface CoffeeMachine {
	void addCoffee();

	void brewFilterCoffee();

	void brewEspresso();
}

class BasicCoffeeMachine implements CoffeeMachine {

	@Override
	public void addCoffee() {
		System.out.println("Adding grounded coffee!");
	}

	@Override
	public void brewFilterCoffee() {
		System.out.println("Brew filtered coffee!");
	}

	@Override
	public void brewEspresso() {
		throw new RuntimeException("Not supported");

	}

}

class EspressoCoffeeMachine implements CoffeeMachine {

	@Override
	public void addCoffee() {
		System.out.println("Adding grounded coffee!");
	}

	@Override
	public void brewFilterCoffee() {
		throw new RuntimeException("Not supported");

	}

	@Override
	public void brewEspresso() {
		System.out.println("Brew Espresso!");
	}

}

interface CoffeeMachineRes{
	void addCoffee();
}

interface BasicCoffeeMachineRes extends CoffeeMachineRes{
	void brewFilterCoffee();
}

interface EspressoMachineRes extends CoffeeMachineRes{
	void brewEspresso();
}


class BasicCoffeeMachineImpl implements BasicCoffeeMachineRes{

	@Override
	public void addCoffee() {
		System.out.println("Adding grounded coffee!");
		
	}

	@Override
	public void brewFilterCoffee() {
		System.out.println("Brew filtered coffee!");

		
	}
	
}

class EspressoMachineImpl implements EspressoMachineRes{

	@Override
	public void addCoffee() {
		
		System.out.println("Adding grounded coffee!");
	}

	@Override
	public void brewEspresso() {
		System.out.println("Brew Espresso!");

	}
	
}
public class InterfaceSegregationExample {

}
