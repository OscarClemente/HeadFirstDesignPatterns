package factory.factoryMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPizzaFactoryMethod {

	@Test
	void NYPizzaStoreTest() {
		NYPizzaStore laCosaNostra = new NYPizzaStore();
		laCosaNostra.orderPizza("bbq");
		laCosaNostra.orderPizza("cheese");
	}
	
	@Test
	void ChicagoPizzaStoreTest() {
		ChicagoPizzaStore windyCityHeat = new ChicagoPizzaStore();
		windyCityHeat.orderPizza("bbq");
		windyCityHeat.orderPizza("cheese");
	}

}
