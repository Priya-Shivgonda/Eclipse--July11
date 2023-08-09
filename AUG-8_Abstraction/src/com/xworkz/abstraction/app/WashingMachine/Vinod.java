package com.xworkz.abstraction.app.WashingMachine;

public class Vinod {
	private WashingMaching machine;

	public Vinod(WashingMaching machine) {
	this.machine = machine;
	}

	public void getRinse() {
		if(machine!= null) {
			System.out.println("Machine is not null");
			this.machine.rinse();
		}
		else {
			System.err.println("machine is null, machine cannot rinse");
		}
	}


}

