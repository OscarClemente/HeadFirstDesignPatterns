package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory)
	{
		name = "Cheese Pizza";
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
