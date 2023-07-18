package com.xworkz.Inheritance;

public class City {
	
	String name;
	int population ;
	String location;
	
	City()
	{
		System.out.println("invoking the no-arg const of animals");
	}
	

 	public City(String name,int population,String  location)
	{
		System.out.println("invoking with const String name,int population,String location of city");
		this.name=name;
		this.population=population;
		this.location=location;
		
	}
	void printInfo()
	{
		System.out.println("city name:"+name);
		System.out.println("city population:"+population);
		System.out.println("location :"+location);
		
		
	}

}

