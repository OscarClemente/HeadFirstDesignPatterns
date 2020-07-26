package factory.factoryMethod.pizza;

public class NYStyleBBQPizza extends Pizza{
	public NYStyleBBQPizza() {
		name = "NY style BBQ pizza";
		dough = "Thin crust dough";
		sauce = "BBQ sauce";
		
		toppings.add("Bacon");
	}

}
