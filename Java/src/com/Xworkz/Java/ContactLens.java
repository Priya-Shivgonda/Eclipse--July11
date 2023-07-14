package com.Xworkz.Java;

public class ContactLens {

	 static String type;
	 double diameter;
	 
	 static void displayStatic()
		{	
		type="Soft Contact Lenses";
		}
	 ContactLens (double diameter)
		{
			this.diameter=diameter;

		}
		void display()
		{
			System.out.println("tyoe of ContactLens="+ContactLens.type);
			System.out.println("daimeter of ContactLens ="+this.diameter);
		}
	}

