package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.printingmachine.Bharath;
import com.xworkz.abstraction.app.printingmachine.CanonPrintingMachine;
import com.xworkz.abstraction.app.printingmachine.PrintingMachine;

public class PrintingMachineRunner {

		public static void main(String[] args) {
			System.out.println("Running main in Printing machine runner\n");

			PrintingMachine machine = new CanonPrintingMachine();

			Bharath bharath = new Bharath(machine);
			bharath.getPrint();

		}

	}


