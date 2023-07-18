package com.xworkz.Inheritance;

public class Building {
	
	String name;
	int noOfFloors;
	boolean rent;
	

 	public Building(String name,int noOfFloors,boolean rent)
	{
		System.out.println("invoking with const String name,int noOfFloors,boolean rent of building");
		this.name=name;
		this.noOfFloors=noOfFloors;
		this.rent=rent;
	}
   void printInfo()
   {
	   
	   System.out.println("building name:"+name);
       System.out.println("building noOfFloors:"+noOfFloors);
       System.out.println("building rent:"+rent);
       
   }
}
