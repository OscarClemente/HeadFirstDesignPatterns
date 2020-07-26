package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredients.PizzaIngredientFactory;

public class BBQPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public BBQPizza(PizzaIngredientFactory ingredientFactory)
	{
		name = "BBQ Pizza";
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		pepperoni = ingredientFactory.createPepperoni();
	}

}
