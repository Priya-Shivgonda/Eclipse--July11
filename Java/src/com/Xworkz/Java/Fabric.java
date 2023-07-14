package com.Xworkz.Java;

public class Fabric {
	
	static String name;
	 String color;
	 
	 static void displayStatic()
		{	
			name="Velvet";
		}
	 Fabric(String color)
		{
			this.color=color;

		}
		void display()
		{
			System.out.println("Name of fabric ="+Fabric.name);
			System.out.println("color of Fabric ="+this.color);
		}
	}

