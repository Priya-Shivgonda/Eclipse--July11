package com.xworkz.Inheritance;

public class Home extends Building {
	
      
      Home(String location,String name,int noOfFloors,boolean rent)
      {
    	  super(name,noOfFloors,rent);
     	  System.out.println("invoking with const string location,String name,int noOfFloors,boolean rent of building");
          this.name=name;
  	   	  this.noOfFloors=noOfFloors;
  	   	  this.rent=rent;
    	 
      }
}
