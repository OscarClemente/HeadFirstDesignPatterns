package factory.factoryMethod.pizza;

public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() {
		name = "NY style sauce and chesse pizza";
		dough = "Thin crust dough";
		sauce = "Marinara sauce";
		
		toppings.add("Gratted reggiano cheese");
	}

}
