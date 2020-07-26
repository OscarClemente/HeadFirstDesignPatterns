package factory.factoryMethod.pizza;

public class ChicagoStyleVeggiePizza extends Pizza{
	public ChicagoStyleVeggiePizza() {
		name = "Chicago style deep dish veggie pizza";
		dough = "Extra thick crust dough";
		sauce = "Tomato sauce";
		
		toppings.add("Random greens");
	}

}
