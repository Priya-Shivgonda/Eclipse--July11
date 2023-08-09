package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.elevator.Elevator;
import com.xworkz.abstraction.app.elevator.MallElevator;
import com.xworkz.abstraction.app.elevator.Rahul;


public class ElevatorRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Elevator Runner\n");

		Elevator elevator = new MallElevator();

		Rahul rahul = new Rahul(elevator);
		rahul.getCarry();
	}

}

