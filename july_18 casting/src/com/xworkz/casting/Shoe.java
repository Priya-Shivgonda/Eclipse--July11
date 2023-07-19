package com.xworkz.casting;

public class Shoe {
	
	int price;
	int size;//enum
	String color;//enum
	
   
	Shoe(int price,int size,String color)
	{
		System.out.println("invoking the const of int price,int size,String color of shoe");
		this.price=price;
		this.size=size;
		this.color=color;

	}
	
}
