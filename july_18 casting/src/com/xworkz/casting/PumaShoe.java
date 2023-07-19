package com.xworkz.casting;

public class PumaShoe extends Shoe {
	
	String model;
	String origin;
	
	PumaShoe(String model,String origin,int price,int size,String color)
	{
		super(price,size,color);
		this.model=model;
		this.origin=origin;
	}
    void printInfo()
    {
    	System.out.println("invoking in pumashoe");
    	System.out.println("puma shoe price="+price);
    	System.out.println("puma shoe size="+size);
    	System.out.println("puma shoe color="+color);
    	System.out.println("puma shoe model="+model);
    	System.out.println("puma shoe origin="+origin);
    	
    	
    }
}
