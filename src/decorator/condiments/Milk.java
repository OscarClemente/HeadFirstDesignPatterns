package decorator.condiments;

import decorator.Beverage;

public class Milk extends CondimentDecorator{
	
	public Milk(Beverage beverage ) {
		mBeverage = beverage;
		mPrice = 0.50f;
		mDescription = " milk";
	}
}
