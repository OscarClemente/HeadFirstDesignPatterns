package command.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import command.commands.CeilingFanOffCommand;
import command.commands.CeilingFanOnCommand;
import command.commands.Command;
import command.commands.GarageDoorDownCommand;
import command.commands.GarageDoorUpCommand;
import command.commands.LightOffCommand;
import command.commands.LightOnCommand;
import command.commands.StereoOffCommand;
import command.commands.StereoOnWithCDCommand;
import command.dispatcher.RemoteControl;
import command.dispatcher.SimpleRemoteControl;
import command.receiver.CeilingFan;
import command.receiver.GarageDoor;
import command.receiver.Light;
import command.receiver.Stereo;

class CommandDispatcherTest {

	@Test
	void lightOnTest() {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("LED");
		Command lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}
	
	@Test
	void multiTest() {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living room");
		Light kitchenLight = new Light("Kitchen room");
		CeilingFan ceilingFan = new CeilingFan("Living room");
		GarageDoor garageDoor = new GarageDoor("Red door");
		Stereo stereo = new Stereo("Living room");
		
		Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		Command kitchenLightOn = new LightOnCommand(kitchenLight);
		Command kitchenLightOff = new LightOffCommand(kitchenLight);
		
		Command ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		Command garageDoorUp = new GarageDoorUpCommand(garageDoor);
		Command garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		Command stereoOff = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
		
		System.out.println(remoteControl); // print button status
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
	}
}
