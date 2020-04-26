package decorator.condiments;

import decorator.Beverage;

public class CondimentDecorator extends Beverage{
	Beverage mBeverage;
	
	public float getPrice() {
		return mBeverage.getPrice() + mPrice - (mDiscountPercentage * mPrice / 100);
	}
	
	public float getRawPrice() {
		return mBeverage.getPrice() + mPrice;
	}
	
	public void setDiscountPercentage(float discount) {
		mDiscountPercentage = discount;
	}
	
	public float getDiscountPercentage() {
		return mDiscountPercentage;
	}
	
	public String getDescription() {
		return mBeverage.getDescription() + mDescription;
	}
}
