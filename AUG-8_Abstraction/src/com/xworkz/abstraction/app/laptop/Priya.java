package com.xworkz.abstraction.app.laptop;

public class Priya  {
	private PrintingMachine machine;

	public Priya(PrintingMachine machine) {
		this.machine = machine;
	}


	public void getPrint() {
		if(machine!=null) {
			System.out.println("Machine is not null");
			this.machine.print();
		}
		else {
			System.err.println("machine is null cannot print");
		}
	}
}


