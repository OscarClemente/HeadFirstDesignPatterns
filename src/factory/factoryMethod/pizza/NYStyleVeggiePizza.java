package factory.factoryMethod.pizza;

public class NYStyleVeggiePizza extends Pizza{
	public NYStyleVeggiePizza() {
		name = "NY style veggie pizza";
		dough = "Thin crust dough";
		sauce = "Tomato sauce";
		
		toppings.add("Random greens");
	}

}
