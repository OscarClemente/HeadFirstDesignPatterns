package command.commands;

import command.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command{
	CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.on();		
	}

}
