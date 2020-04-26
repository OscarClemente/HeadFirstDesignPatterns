package decorator;

public class Beverage {
	protected float mPrice;
	protected float mDiscountPercentage;
	protected String mDescription;
	
	public float getPrice() {
		return mPrice - (mDiscountPercentage * mPrice / 100);
	}
	
	public float getRawPrice() {
		return mPrice;
	}
	
	public void setDiscountPercentage(float discount) {
		mDiscountPercentage = discount;
	}
	
	public float getDiscountPercentage() {
		return mDiscountPercentage;
	}
	
	public String getDescription() {
		return mDescription;
	}
}
