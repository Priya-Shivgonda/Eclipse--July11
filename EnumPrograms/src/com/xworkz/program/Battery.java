package com.xworkz.program;

public class Battery {

	String brand;
	int price;
	BatteryType type;  //enum
        int  noOfBattery ;
	
	
	// constructor
	Battery(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
		
	}
	
	//method declaration
	void noOfBattery(int  noOfBattery)
	{
		this.noOfBattery=noOfBattery;

	}
	
	//DISPLAY
	void display()
	{
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.type);
		System.out.println(this.noOfBattery);
		
	}
}



