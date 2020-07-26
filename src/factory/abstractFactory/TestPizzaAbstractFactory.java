package factory.abstractFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factory.abstractFactory.ingredients.PizzaIngredientFactory;
import factory.abstractFactory.ingredients.chicago.ChicagoPizzaIngredientFactory;
import factory.abstractFactory.ingredients.newYork.NYPizzaIngredientFactory;
import factory.abstractFactory.pizza.BBQPizza;
import factory.abstractFactory.pizza.CheesePizza;
import factory.abstractFactory.pizza.ClamPizza;
import factory.abstractFactory.pizza.Pizza;
import factory.abstractFactory.pizza.VeggiePizza;

class TestPizzaAbstractFactory {

	@Test
	void NYPizzaAbstractFactoryTest() {
		PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();
		Pizza veggiePizza = new VeggiePizza(nyIngredientFactory);
		veggiePizza.prepare();
		System.out.println(veggiePizza.toString());
		
		Pizza bbqPizza = new BBQPizza(nyIngredientFactory);
		bbqPizza.prepare();
		System.out.println(bbqPizza.toString());
		
		assertNotEquals(bbqPizza.toString(), veggiePizza.toString());
	}
	
	@Test
	void ChicagoPizzaAbstractFactoryTest() {
		PizzaIngredientFactory chicagoIngredientFactory = new ChicagoPizzaIngredientFactory();
		Pizza clamPizza = new ClamPizza(chicagoIngredientFactory);
		clamPizza.prepare();
		System.out.println(clamPizza.toString());
		
		Pizza cheesePizza = new CheesePizza(chicagoIngredientFactory);
		cheesePizza.prepare();
		System.out.println(cheesePizza.toString());
		
		assertNotEquals(cheesePizza.toString(), clamPizza.toString());
	}
	
	@Test
	void IngredientsaAbstractFactoryTest() {
		PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();
		PizzaIngredientFactory chicagoIngredientFactory = new ChicagoPizzaIngredientFactory();
		
		Pizza nyCheesePizza = new CheesePizza(nyIngredientFactory);
		nyCheesePizza.prepare();
		System.out.println(nyCheesePizza.toString());
		
		Pizza chicagoCheesePizza = new CheesePizza(chicagoIngredientFactory);
		chicagoCheesePizza.prepare();
		System.out.println(chicagoCheesePizza.toString());
		
		assertNotEquals(chicagoCheesePizza.toString(), nyCheesePizza.toString());
	}

}
