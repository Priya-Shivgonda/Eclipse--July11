package com.Xworkz.Java;

public class Vaccum {
	
	
	static String brand;
	 String  model;
	 
	 static void displayStatic()
		{	
			brand="Dyson";
		}
	    Vaccum(String model)
		{
			this.model=model;

		}
		void display()
		{
			System.out.println("brand of vaccum ="+Vaccum.brand);
			System.out.println("model of vaccum="+this.model);
		}
	}

	


