package factory.factoryMethod;

import factory.factoryMethod.pizza.NYStyleCheesePizza;
import factory.factoryMethod.pizza.NYStyleVeggiePizza;
import factory.factoryMethod.pizza.NYStyleClamPizza;
import factory.factoryMethod.pizza.NYStyleBBQPizza;
import factory.factoryMethod.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		}
		else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		}
		else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		}
		else if (type.equals("bbq")) {
			return new NYStyleBBQPizza();
		}
		else return null;
	}
}
