package observer.display;

import observer.DisplayElement;
import observer.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	float mTemp;
	float mHumidity;
	float mPressure;
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		mTemp = temp;
		mHumidity = humidity;
		mPressure = pressure;
	}

	@Override
	public void display() {
		System.out.println("Current conditions are: ");
		System.out.println("Temp: " + mTemp + ", Humidity: " + mHumidity + ", Pressure: " + mPressure);
	}

}
