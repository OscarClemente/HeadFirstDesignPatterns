package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredients.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory)
	{
		name = "Veggie Pizza";
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		veggies = ingredientFactory.createVeggies();
	}

}
