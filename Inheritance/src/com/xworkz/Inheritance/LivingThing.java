package com.xworkz.Inheritance;

public class LivingThing {
	
	
	String name ;
	int noOfLivingThing;
	String type;

	
	LivingThing()
	{
		System.out.println("invoking the no-arg const of animals");
	}
	

 	public LivingThing(String name,int noOfLivingThing,String type)
	{
		System.out.println("invoking with const String name,int noOfLivingThing,String type of  LivingThing") ;
		this.name=name;
		this.noOfLivingThing=noOfLivingThing;
		this.type=type;
		
	}
	void printInfo()
	{
		System.out.println("LivingThing name:"+name);
		System.out.println("LivingThing noOfLivingThing:"+noOfLivingThing);
		System.out.println("LivingThings type:"+type);
		
		
	}

}

