package com.xworkz.abstraction.app.elevator;

public class Rahul {

	private Elevator elevator;

	public  Rahul(Elevator elevator) {
		this.elevator = elevator;
	}

	public void getCarry() {
		if(elevator!=null) {
			System.out.println("Elevator is not null");
			this.elevator.carry();
		}
		else {
			System.err.println("Elevator is null, cannot carry");
		}
	}
}

