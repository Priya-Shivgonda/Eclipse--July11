package com.xworkz.Inheritance;

public class Money extends Strength {
	
	Money()
	
	{
		System.out.println("invoking the no-arg const of animals");
	}
	
	
    
   Money(String type,int count,String currencyName)
    {
  	  super(type,count,currencyName);
  	  System.out.println("invoking with const String type,int count,String currencyName ");
  	  this.type=type;
	  this.currencyName=currencyName;
	  this.count=count ;
    }
}

