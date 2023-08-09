package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.WashingMachine.Vinod;
import com.xworkz.abstraction.app.WashingMachine.WashingMaching;
import com.xworkz.abstraction.app.WashingMachine.WhirlpoolWashingMachine;

public class WashingMachineRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Washing machine runner\n");

		
		WashingMaching machine = new WhirlpoolWashingMachine();


		Vinod vinod = new Vinod(machine);
		vinod.getRinse();

	}

}

