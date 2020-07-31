package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSingleton {

	@Test
	void multipleInstantiationTest() {
		SingletonChocolateBoiler boiler1 = SingletonChocolateBoiler.getInstance();
		SingletonChocolateBoiler boiler2 = SingletonChocolateBoiler.getInstance();
		
		assertSame(boiler1, boiler2);
		
		boiler1.fill();
		assertFalse(boiler1.isEmpty());
		assertFalse(boiler2.isEmpty());
		
		// Redundant, yes.
		assertEquals(boiler1.isEmpty(), boiler2.isEmpty());
		
		boiler2.boil();
		assertTrue(boiler2.isBoiled());
		assertEquals(boiler1.isBoiled(), boiler2.isBoiled());
		
		boiler1.drain();
		assertTrue(boiler1.isEmpty());
		assertEquals(boiler1.isEmpty(), boiler2.isEmpty());
	}
}
