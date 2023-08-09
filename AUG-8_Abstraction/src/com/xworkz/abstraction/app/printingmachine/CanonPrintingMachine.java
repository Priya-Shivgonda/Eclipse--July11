package com.xworkz.abstraction.app.printingmachine;



	public class CanonPrintingMachine implements PrintingMachine{

		@Override
		public void print() {
			System.out.println("Print is running in Canon print machine\n");
		}

	}