package com.Xworkz.Java;

public class Coastal {
	static String coastalLocation;
	 int noOfCostalArea;
	 
	 static void displayStatic()
		{	
		 coastalLocation="Karnataka";
		}
	 Coastal (int noOfCostalArea)
		{
			this.noOfCostalArea=noOfCostalArea;

		}
		void display()
		{
			System.out.println("Location of Coastal  ="+Coastal.coastalLocation);
			System.out.println(" noOfCoastalAreas ="+this.noOfCostalArea);
		}
	}
