package com.xworkz.Inheritance;

public class Monkey extends Animal{
	Monkey ()
	
	{
		System.out.println("invoking the no-arg const of animals");
	}
	
	
   Monkey(String name,int noOfAnimals,String species,String habitat)
    {
  	  super(name,noOfAnimals,species,habitat);
  	  System.out.println("invoking with const String name,int noOfAnimals,String species,String habitat of animals");
      this.name=name;
   	  this.noOfAnimals=noOfAnimals;
	  this.species= species;
	  this.habitat=habitat;	  
  	 
    }
}

     