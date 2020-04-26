package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	private List<Observer> mObserver = new ArrayList<Observer>();
	
	float mTemp;
	float mHumidity;
	float mPressure;

	@Override
	public boolean registerObserver(Observer observer) {
		// yes, this could be done in one line, but it's purpose is easier to understand this way.
		boolean added = mObserver.add(observer);
		return added;
	}

	@Override
	public boolean removeObserver(Observer observer) {
		boolean removed = mObserver.remove(observer);
		return removed;
	}
	
	@Override
	public void notifyObservers() {
		mObserver.forEach((observer)->observer.update(mTemp, mHumidity, mPressure));
	}
	
	public void setData(float temp, float humidity, float pressure) {
		mTemp = temp;
		mHumidity = humidity;
		mPressure = pressure;
		
		// Notify whenever there are new values, set and notify could be done at different times.
		notifyObservers();
	}
}
