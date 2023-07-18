package com.xworkz.Inheritance;

public class  Bangalore extends  City  {
	
	Bangalore()
	
	{
		System.out.println("invoking the no-arg const of animals");
	}
	
	
    
	Bangalore(String name,int population,String location)
    {
  	  super(name,population,location);
  	  System.out.println("invoking with const String name,int population,String location of city");
      this.name=name;
   	  this.population=population;
	  this.location=location;
	    
  	 
    }
}

 
