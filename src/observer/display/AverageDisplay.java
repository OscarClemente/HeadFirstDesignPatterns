package observer.display;

import observer.DisplayElement;
import observer.Observer;

public class AverageDisplay implements Observer, DisplayElement{

	float mAvgTemp;
	float mAvgHumidity;
	float mAvgPressure;
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// Yes, this is not an actual average, but after all, this code is just for testing.
		mAvgTemp = (mAvgTemp+temp)/2;
		mAvgHumidity = (mAvgHumidity+humidity)/2;
		mAvgPressure = (mAvgPressure+pressure)/2;
	}

	@Override
	public void display() {
		System.out.println("Average conditions are: ");
		System.out.println("Temp: " + mAvgTemp + ", Humidity: " + mAvgHumidity + ", Pressure: " + mAvgPressure);
	}

}
