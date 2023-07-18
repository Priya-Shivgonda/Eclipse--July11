package com.xworkz.Inheritance;

public class Plant extends LivingThing {
  Plant ()
	
	{
		System.out.println("invoking the no-arg const of animals");
	}
	
	
    
   Plant(String name,int noOfLivingThing,String type)
    {
  	  super(name,noOfLivingThing,type);
  	  System.out.println("invoking with const String name,int noOfLivingThing,String type of living things");
      
  	this.name=name;
	this.noOfLivingThing=noOfLivingThing;
	this.type=type;
    }
}
