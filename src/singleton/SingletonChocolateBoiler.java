package singleton;

public class SingletonChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static SingletonChocolateBoiler uniqueInstance;
	
	private SingletonChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	// synchronized to avoid issues with two threads this at the same time
	// not optimal, but this is not an example about performance optimization
	// for threading.
	public static synchronized SingletonChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonChocolateBoiler();
		}
		
		return uniqueInstance;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
