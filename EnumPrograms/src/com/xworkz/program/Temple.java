package com.xworkz.program;

public class Temple {

	String name;
	String location;
	TypeOfTemple type;  //enum
     int timing;
	
	
	// constructor
	Temple(String name,String location)
	{
		this.name=name;
		this.location=location;
		
	}
	
	//method declaration
	void  time(int timing)
	{
		this.timing=timing;

	}
	
	//DISPLAY
	void display()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.type);	
		System.out.println(this.timing);
		
		
		
	}
}


