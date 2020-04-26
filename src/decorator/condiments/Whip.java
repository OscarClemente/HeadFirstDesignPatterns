package decorator.condiments;

import decorator.Beverage;

public class Whip extends CondimentDecorator{
	
	public Whip(Beverage beverage ) {
		mBeverage = beverage;
		mPrice = 1.75f;
		mDescription = " whip";
	}
}
