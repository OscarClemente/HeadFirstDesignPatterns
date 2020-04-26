package decorator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import decorator.Beverage;
import decorator.Espresso;
import decorator.condiments.Milk;
import decorator.condiments.Mocha;

class BeverageTest {
	
	//This could actually be a method inside the Beverage class, it would e better.
	void printDescAndPrice(Beverage beverage) {
		System.out.println(beverage.getDescription() + " costs " + beverage.getPrice() + "€");
		System.out.println("It has a " + beverage.getDiscountPercentage() + "% discount out of the original " + beverage.getRawPrice() + " price tag");
	}

	@Test
	void test() {
		Espresso myEspresso = new Espresso();
		printDescAndPrice(myEspresso);
		
		myEspresso.setDiscountPercentage(20);
		printDescAndPrice(myEspresso);
		
		myEspresso.setDiscountPercentage(0);
		printDescAndPrice(myEspresso);
		
		Milk myMilkEspresso = new Milk(myEspresso);
		printDescAndPrice(myMilkEspresso);
		
		Mocha myMochaMilkEspresso = new Mocha(myMilkEspresso);
		printDescAndPrice(myMochaMilkEspresso);
	}

}
