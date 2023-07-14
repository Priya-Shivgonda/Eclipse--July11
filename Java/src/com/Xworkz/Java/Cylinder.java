package com.Xworkz.Java;

public class Cylinder {
 static String name;
 int cost;
 
 static void displayStatic()
	{	
		name="HP";
	}
	Cylinder(int cost)
	{
		this.cost=cost;

	}
	void display()
	{
		System.out.println("Name of cylinder ="+Cylinder.name);
		System.out.println("cost of cylinder="+this.cost);
	}
}
