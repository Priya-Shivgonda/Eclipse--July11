package com.Xworkz.Java;

public class Engine {
	
	 static String name;
	 double cost;
	 
	 static void displayStatic()
		{	
			name="Steam engine";
		}
	 Engine(double cost)
		{
			this.cost=cost;

		}
		void display()
		{
			System.out.println("Name of engine ="+Engine.name);
			System.out.println("cost of engine="+this.cost);
		}
	}

