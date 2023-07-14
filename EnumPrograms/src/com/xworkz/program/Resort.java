package com.xworkz.program;

public class Resort {
	
	String name;
	String ownerName;
	TypeOfResort roomType;  //enum
    String breakFast;
	
	
	// constructor
	Resort(String name,String ownerName)
	{
		this.name=name;
		this.ownerName=ownerName;
		
	}
	
	//method declaration
	void ownerName(String ownerName)
	{
		this.ownerName=ownerName;

	}
	
	//DISPLAY
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.ownerName);
		System.out.println(this.roomType);
		System.out.println(this.breakFast);
		
	}
}

