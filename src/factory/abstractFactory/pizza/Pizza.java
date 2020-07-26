package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredients.Cheese;
import factory.abstractFactory.ingredients.Clams;
import factory.abstractFactory.ingredients.Dough;
import factory.abstractFactory.ingredients.Pepperoni;
import factory.abstractFactory.ingredients.Sauce;
import factory.abstractFactory.ingredients.Veggies;

public abstract class Pizza {
	String name;
	
	Dough dough;
	Cheese cheese;
	Clams clams;
	Pepperoni pepperoni;
	Sauce sauce;
	Veggies veggies[];
	

	public abstract void prepare();
  
	public void bake() {
		System.out.println("Bake for 25 minutes at 350º.");
	}
 
	public void cut() {
		System.out.println("Cut the pizza into diagonal slices.");
	}
  
	public void box() {
		System.out.println("Place pizza in official PizzaStore box.");
	}
 
	public String getName() {
		return name;
	}
	
	public String toString() {
		String description = name + " has the following ingredients: ";
		
		if (dough != null)
		{
			description += dough.toString() + ", ";
		}
		if (sauce != null)
		{
			description += sauce.toString() + ", ";
		}
		if (cheese != null)
		{
			description += cheese.toString() + ", ";
		}
		if (pepperoni != null)
		{
			description += pepperoni.toString() + ", ";
		}
		
		return description;
	}
}
