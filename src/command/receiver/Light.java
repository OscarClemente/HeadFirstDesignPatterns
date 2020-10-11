package command.receiver;

public class Light {
	String name;
	
	public Light(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println("Light " + name + " was turned on.");
	}
	
	public void off() {
		System.out.println("Light " + name + " was turned off.");
	}
}
