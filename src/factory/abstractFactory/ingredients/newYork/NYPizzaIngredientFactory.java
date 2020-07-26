package factory.abstractFactory.ingredients.newYork;

import factory.abstractFactory.ingredients.Cheese;
import factory.abstractFactory.ingredients.Clams;
import factory.abstractFactory.ingredients.Dough;
import factory.abstractFactory.ingredients.Pepperoni;
import factory.abstractFactory.ingredients.PizzaIngredientFactory;
import factory.abstractFactory.ingredients.Sauce;
import factory.abstractFactory.ingredients.Veggies;
import factory.abstractFactory.ingredients.common.Garlic;
import factory.abstractFactory.ingredients.common.Mushroom;
import factory.abstractFactory.ingredients.common.Onion;
import factory.abstractFactory.ingredients.common.RedPepper;
import factory.abstractFactory.ingredients.common.SlicedPepperoni;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		// TODO Auto-generated method stub
		return null;
	}

}
