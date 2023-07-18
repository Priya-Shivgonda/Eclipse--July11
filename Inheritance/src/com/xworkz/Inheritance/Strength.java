package com.xworkz.Inheritance;

public class Strength {
	String type;
	String currencyName;
	int count;
	Strength()
	{
		System.out.println("invoking the no-arg const of animals");
	}
	

 	public Strength(String type,int count,String currencyName)
	{
		System.out.println("invoking with const String name,int count,String currencyName ");
		this.type=type;
		this.currencyName=currencyName;
		this.count=count ;
	
	}
	void printInfo()
	{
		System.out.println("Strength type:"+type);
		System.out.println("Strength currencyName:"+currencyName);
		System.out.println("Strengt count:"+count);
		
		
	}

}


