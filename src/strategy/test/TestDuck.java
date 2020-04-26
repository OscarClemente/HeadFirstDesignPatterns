package strategy.test;

import static org.junit.jupiter.api.Assertions.*;

import strategy.DecoyDuck;
import strategy.Duck;
import strategy.MallardDuck;
import strategy.fly.FlyBehavior;
import strategy.fly.FlyWithWings;
import strategy.fly.FlyNoWay;
import strategy.quack.Quack;
import strategy.quack.QuackBehavior;
import strategy.quack.MuteQuack;

import org.junit.jupiter.api.Test;

class TestDuck {

	@Test
	void duckDisplayTest() {
		Duck myDuck = new Duck();
		assertTrue(myDuck != null);
		myDuck.display();
	}
	
	@Test
	void mallardDuckTest() {
		MallardDuck mallardDuck = new MallardDuck();
		FlyBehavior flyBehavior = new FlyWithWings();
		QuackBehavior quackBehavior = new Quack();
		
		mallardDuck.setFlyBehavior(flyBehavior);
		mallardDuck.setQuackBehavior(quackBehavior);
		
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}
	
	@Test
	void decoyDuckTest() {
		DecoyDuck decoyDuck = new DecoyDuck();
		FlyBehavior flyBehavior = new FlyNoWay();
		QuackBehavior quackBehavior = new MuteQuack();
		
		decoyDuck.setFlyBehavior(flyBehavior);
		decoyDuck.setQuackBehavior(quackBehavior);
		
		decoyDuck.performFly();
		decoyDuck.performQuack();
	}

}
