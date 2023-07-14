package com.xworkz.program;

public class Phone{

	
	String brand;
	int price;
	PhoneType type;  //enum
    int  noOfPhone ;
    
    
	// constructor
      Phone(String brand,int price)
   	{
		this.brand=brand;
		this.price=price;
		
	}
	
	//method declaration
	void noOfPhone(int  noOfPhone)
	{
		this.noOfPhone=noOfPhone;

	}
	
	//DISPLAY
	void display()
	{
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.type);
		System.out.println(this.noOfPhone);
		
	}
}



