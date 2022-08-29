package com.example.solid;
/**
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * Abstractions should not depend on details. Details should depend on abstractions.
 * @author adityajain
 *
 */

interface CoffeeMachineOth {
    void brewFilterCoffee();
}

interface EspressoMachine {
    void brewEspresso();
}

class BasicCoffeeMachineOth implements CoffeeMachineOth{

	@Override
	public void brewFilterCoffee() {
		System.out.println("Brewing Filter coffee using basic coffee machine");
	}
	
}

class PremiumCoffeeMachine implements CoffeeMachineOth, EspressoMachine {

	@Override
	public void brewEspresso() {
		System.out.println("Brewing Espresso");

		
	}

	@Override
	public void brewFilterCoffee() {
		System.out.println("Brewing Filter coffee using Premium coffee machine");
		
	}
	
}

class CoffeeApp {
    private CoffeeMachineOth coffeeMachine;

    CoffeeApp(CoffeeMachineOth coffeeMachine) {
     this.coffeeMachine = coffeeMachine;
    }

    public void prepareCoffee() {
        this.coffeeMachine.brewFilterCoffee();
        System.out.println("Coffee is ready!");
    }  
}
public class DependencyInversionExample {

	public static void main(String[] args) {
		PremiumCoffeeMachine machine = new PremiumCoffeeMachine();
		BasicCoffeeMachineOth basicMachine = new BasicCoffeeMachineOth();
		CoffeeApp app = new CoffeeApp(machine);
		app.prepareCoffee();
		

	}
}
