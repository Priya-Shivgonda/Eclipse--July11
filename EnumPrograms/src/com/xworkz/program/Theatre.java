package com.xworkz.program;

public class Theatre {
	
	
	String name;
	String location;
	int seatingCapacity;
	TypeOfTheatre type;
	
	Theatre(String name,String location)
	{
		System.out.println("invoking the constructor");
		this.name=name;
	}
	void  location(String location)
	{
		this.location=location;
		
	}
	
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.seatingCapacity);
		System.out.println(this.type);
		
	}

}
