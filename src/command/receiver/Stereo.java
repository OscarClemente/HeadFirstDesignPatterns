package command.receiver;

public class Stereo {
	String name;
	
	public Stereo(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println("Stereo " + name + " is ON.");
	}
	
	public void off() {
		System.out.println("Stereo " + name + " is OFF.");
	}
	
	public void setCD() {
		System.out.println("Stereo " + name + " CD is set.");
	}
	
	public void setDVD() {
		System.out.println("Stereo " + name + " DVD is set.");
	}
	
	public void setRadio() {
		System.out.println("Stereo " + name + " Radio is set.");
	}
	
	public void setVolume(int volume) {
		System.out.println("Stereo " + name + " Volume changed to " + volume + ".");
	}
}
