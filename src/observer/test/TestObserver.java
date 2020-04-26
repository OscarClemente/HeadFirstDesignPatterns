package observer.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import observer.WeatherData;
import observer.display.AverageDisplay;
import observer.display.CurrentConditionsDisplay;

class TestObserver {

	@Test
	void test() {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
		AverageDisplay averageDisplay = new AverageDisplay();
		
		weatherData.registerObserver(currentConditionsDisplay);
		weatherData.registerObserver(averageDisplay);
		
		currentConditionsDisplay.display();
		
		weatherData.setData(20, 44, 10);
		currentConditionsDisplay.display();
		averageDisplay.display();
	}

}
