package com.Xworkz.Java;

public class SimCard {
	
	static String name;
	 int  noOfSimCard;
	 
	 static void displayStatic()
		{	
		 name="airtel";
		}
	 SimCard (int noOfSimCard)
		{
			this.noOfSimCard=noOfSimCard;

		}
		void display()
		{
			System.out.println("SimCard name ="+SimCard.name);
			System.out.println(" noOfSimCard ="+this.noOfSimCard );
		}
	}



