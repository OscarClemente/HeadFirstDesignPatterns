package command.receiver;

public class CeilingFan {
	String name;
	
	public CeilingFan(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println("CelingFan " + name + " is on.");
	}
	
	public void off() {
		System.out.println("CelingFan " + name + " is off.");
	}
}
