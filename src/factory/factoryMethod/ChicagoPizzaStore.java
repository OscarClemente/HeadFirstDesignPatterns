package factory.factoryMethod;

import factory.factoryMethod.pizza.ChicagoStyleCheesePizza;
import factory.factoryMethod.pizza.ChicagoStyleVeggiePizza;
import factory.factoryMethod.pizza.ChicagoStyleClamPizza;
import factory.factoryMethod.pizza.ChicagoStyleBBQPizza;
import factory.factoryMethod.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}
		else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		}
		else if (type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		}
		else if (type.equals("bbq")) {
			return new ChicagoStyleBBQPizza();
		}
		else return null;
	}
}
