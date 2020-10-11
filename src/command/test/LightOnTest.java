package command.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import command.commands.Command;
import command.commands.LightOnCommand;
import command.dispatcher.SimpleRemoteControl;
import command.receiver.Light;

class LightOnTest {

	@Test
	void test() {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		Command lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}

}
