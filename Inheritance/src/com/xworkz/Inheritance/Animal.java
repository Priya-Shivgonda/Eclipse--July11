package com.xworkz.Inheritance;

public class Animal {

	
	String name;
	int noOfAnimals;
	String species;
	String habitat;
	Animal()
	{
		System.out.println("invoking the no-arg const of animals");
	}
	

 	public Animal(String name,int noOfAnimals,String species,String habitat)
	{
		System.out.println("invoking with const String name,int noOfAnimals,String habitat ,String habitat of animal");
		this.name=name;
		this.noOfAnimals=noOfAnimals;
		this.species= species;
		this.habitat=habitat;
	}
	void printInfo()
	{
		System.out.println("animal name:"+name);
		System.out.println("animal noOfAnimals:"+noOfAnimals);
		System.out.println("animal species:"+species);
		System.out.println("animal habitat:"+habitat);
		
	}

}
