package com.xworkz.program;

public class BatteryRunner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BatteryRunner main method");
		Battery ref=new Battery("Duracell",400);
		ref.noOfBattery(70);
		ref.type=BatteryType.Zinc_Carbon_Batteries;
		ref.display();
		
		
		Battery ref1=new Battery(" Energizer",300);
		ref1.noOfBattery(70);
		ref1.type=BatteryType.Lead_Acid_Batteries;
		ref1.display();
		
		
	    
	}

	}