package com.Xworkz.Java;

public class NailCutter {

	
	static String brand;
	 int cost;
	 
	 static void displayStatic()
		{	
		brand ="Seki Edge";
		}
	 NailCutter (int cost)
		{
			this.cost=cost;

		}
		void display()
		{
			System.out.println("NailCutte brand ="+NailCutter.brand);
			System.out.println(" NailCutter cost ="+this.cost);
		}
	}


