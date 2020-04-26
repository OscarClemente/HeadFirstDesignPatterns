package decorator.condiments;

import decorator.Beverage;

public class Mocha extends CondimentDecorator{
	
	public Mocha(Beverage beverage ) {
		mBeverage = beverage;
		mPrice = 1.50f;
		mDescription = " mocha";
	}
}
