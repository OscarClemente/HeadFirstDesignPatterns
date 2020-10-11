package command.receiver;

public class GarageDoor {
	String name;
	
	public GarageDoor(String name) {
		this.name = name;
	}
	
	public void up() {
		System.out.println("Garage door " + name + " is up.");
	}

	public void down() {
		System.out.println("Garage door " + name + " is down.");
	}
}
