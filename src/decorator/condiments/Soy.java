package decorator.condiments;

import decorator.Beverage;

public class Soy extends CondimentDecorator{
	
	public Soy(Beverage beverage ) {
		mBeverage = beverage;
		mPrice = 0.75f;
		mDescription = " soy";
	}
}
