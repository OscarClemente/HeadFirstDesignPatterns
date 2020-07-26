package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredients.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory)
	{
		name = "Clam Pizza";
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clams = ingredientFactory.createClams();
	}

}
