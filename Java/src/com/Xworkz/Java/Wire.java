package com.Xworkz.Java;

public class Wire {

	static String type;
	 int  noOfWire;
	 
	 static void displayStatic()
		{	
		 type="Copper Wire";
		}
	  Wire (int noOfWire)
		{
			this.noOfWire=noOfWire;

		}
		void display()
		{
			System.out.println("Wire type ="+Wire.type);
			System.out.println("noOfWire ="+this.noOfWire);
		}
	}

